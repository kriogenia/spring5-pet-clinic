package dev.sotoestevez.spring5petclinic.model

import java.lang.IllegalStateException
import java.time.LocalDateTime

class Pet(
	name: String,
	var petType: PetType,
	val birthDate: LocalDateTime
) : NamedEntity(name) {

	var owner: Owner
		get() = mOwner ?: throw IllegalStateException("Pet owner is required")
		set(value) {
			mOwner = value
		}
	private var mOwner: Owner? = null

}

class PetType(name: String) : NamedEntity(name)
