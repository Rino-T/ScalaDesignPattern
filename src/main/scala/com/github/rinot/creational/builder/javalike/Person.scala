package com.github.rinot.creational.builder.javalike

class Person(builder: Person.Builder) {
  val firstName = builder.firstName
  val lastName  = builder.lastName
  val age       = builder.age
}

object Person {
  class Builder {
    var firstName: String = ""
    var lastName: String  = ""
    var age               = 0

    def setFirstName(firstName: String): Builder = {
      this.firstName = firstName
      this
    }

    def setLastName(lastName: String): Builder = {
      this.lastName = lastName
      this
    }

    def setAge(age: Int): Builder = {
      this.age = age
      this
    }

    def build = new Person(this)
  }
}
