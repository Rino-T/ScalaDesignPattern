package com.github.rinotc.creational.builder.gtc

class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
) {
  protected def this() = this("", "", 0)
  protected def this(pb: Person.Builder[_]) = this(pb.firstName, pb.lastName, pb.age)
}

object Person {
  sealed trait BuildStep
  sealed trait HasFirstName extends BuildStep
  sealed trait HasLastName  extends BuildStep

  class Builder[PassedStep <: BuildStep] private (
      var firstName: String,
      var lastName: String,
      var age: Int
  ) {
    protected def this() = this("", "", 0)

    protected def this(pb: Builder[_]) = this(
      pb.firstName,
      pb.lastName,
      pb.age
    )

    def setFirstName(firstName: String): Builder[HasFirstName] = {
      this.firstName = firstName
      new Builder[HasFirstName](this)
    }

    def setLastName(lastName: String)(implicit ev: PassedStep =:= HasFirstName): Builder[HasLastName] = {
      this.lastName = lastName
      new Builder[HasLastName](this)
    }

    def setAge(age: Int): Builder[PassedStep] = {
      this.age = age
      this
    }

    def build(implicit ev: PassedStep =:= HasLastName): Person = {
      new Person(firstName, lastName, age)
    }
  }

  object Builder {
    def apply() = new Builder[BuildStep]()
  }
}
