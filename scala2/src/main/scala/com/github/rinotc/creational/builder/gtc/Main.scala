package com.github.rinotc.creational.builder.gtc

object Main {
  def main(args: Array[String]): Unit = {
    val person = Person
      .Builder()
      .setFirstName("太郎")
      .setLastName("田中")
      .setAge(33)
      .build

    println(s"Person: ${person.lastName} ${person.firstName}, ${person.age}歳")
  }
}
