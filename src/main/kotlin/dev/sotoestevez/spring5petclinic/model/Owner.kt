package dev.sotoestevez.spring5petclinic.model

data class Owner(
		override val firstName: String,
		override val lastName: String
): Person(firstName, lastName)