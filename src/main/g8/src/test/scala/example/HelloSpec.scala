package example

import org.scalatest._

class HelloSpec extends WordSpec with Matchers {
  "The Hello object" should {
    "say hello" in {
      Hello.greeting shouldEqual "hello"
    }
  }
}
