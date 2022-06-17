package com.github.rinotc.creational.builder.caseclass

object Main {
  def main(args: Array[String]): Unit = {
    val person1 = Person(
      "太郎",
      "田中",
      26
    )
    val person2 = Person("花子")

    println(s"Person1: $person1")
    println(s"Person2: $person2")
  }
}
