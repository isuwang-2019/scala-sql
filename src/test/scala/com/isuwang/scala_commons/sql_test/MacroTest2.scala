package com.isuwang.scala_commons.sql_test

import com.isuwang.scala_commons.sql._

@db(name = "default")
object MacroTest2 {

  case class User(name:String, age: Option[Int])

  def main(args: Array[String]): Unit = {

    val name = "wang"
    val age = 10

    val rs: ResultSetEx = null
    val access = implicitly[JdbcValueAccessor[Option[Int]]]

    println(s"$access ${access.getClass}")
  }

}
