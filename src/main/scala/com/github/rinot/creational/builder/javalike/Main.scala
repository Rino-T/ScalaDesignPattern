package com.github.rinot.creational.builder.javalike

import com.github.rinot.creational.builder.javalike

object Main {
  def main(args: Array[String]): Unit = {
    val person = new javalike.Person.Builder()
      .setFirstName("太郎")
      .setLastName("田中")
      .setAge(26)
      .build

    println(s"Person: ${person.lastName} ${person.firstName}, ${person.age}歳")
  }
}
