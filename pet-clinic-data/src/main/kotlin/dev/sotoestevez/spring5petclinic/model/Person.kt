package dev.sotoestevez.spring5petclinic.model

open class Person(
		open val firstName: String,
		open val lastName: String
): BaseEntity()
