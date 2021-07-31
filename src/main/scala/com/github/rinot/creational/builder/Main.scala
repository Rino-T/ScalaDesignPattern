package com.github.rinot.creational.builder

import com.github.rinot.creational.builder.javalike

object Main {
  @main def javaLike = {
    val person = new javalike.Person.Builder()
      .setFirstName("太郎")
      .setLastName("田中")
      .setAge(26)
      .build

    println(s"Person: ${person.lastName} ${person.firstName}, ${person.age}歳")
  }

  @main def useCaseClass = {
    val person1 = caseclass.Person(
      "太郎",
      "田中",
      26
    )
    val person2 = caseclass.Person("花子")

    println(s"Person1: $person1")
    println(s"Person2: $person2")
  }
}
