package com.github.notyy.typeflow.util

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class JSONUtilTest extends AnyFunSpec with Matchers {
  case class User(name: String ,age: Int)

  describe("JSONUtil"){
    it("can format simple type with default format") {
      val expectedJson = """{"name":"xyz","age":10}"""
      JSONUtil.toJSON(User("xyz", 10)) shouldBe expectedJson
      val user = JSONUtil.fromJSON[User](expectedJson).get
      user.name shouldBe "xyz"
      user.age shouldBe 10
    }
    it("this test used to manually show json") {
      val value:Integer = 1
      println(s"json of $value is: ${JSONUtil.toJSON(value)}")
    }
  }
}
