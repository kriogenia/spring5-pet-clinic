package dev.sotoestevez.spring5petclinic.model

data class Vet(
		override val firstName: String,
		override val lastName: String
): Person(firstName, lastName)
