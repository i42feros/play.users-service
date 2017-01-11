package controllers

import com.google.inject.{Inject, Singleton}
import play.api.mvc.{Action, Controller}
import services.HelloWorldService

@Singleton
class HomeController @Inject() (helloWorldService: HelloWorldService) extends Controller {

  def index = Action {
    Ok(helloWorldService.sayHello)
  }

}
