package integration

import org.scalatestplus.play.{OneServerPerTest, PlaySpec}
import play.api.http.Status._
import play.api.libs.ws.WSClient
import play.api.test.{DefaultAwaitTimeout, FutureAwaits}

class HomeIntegrationSpec extends PlaySpec with OneServerPerTest with FutureAwaits with DefaultAwaitTimeout {
  "Application" should {
    "return a hello world message" in {
      val wsClient = app.injector.instanceOf[WSClient]
      val myPublicAddress =  s"localhost:$port"
      val indexURL = s"http://$myPublicAddress/"
      val response = await(wsClient.url(indexURL).get())

      response.status mustBe (OK)
      response.body mustBe ("Hello world!!")
    }
  }
}
