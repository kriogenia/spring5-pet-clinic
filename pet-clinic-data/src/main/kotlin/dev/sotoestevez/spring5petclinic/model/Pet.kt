package dev.sotoestevez.spring5petclinic.model

import org.springframework.core.style.ToStringCreator
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

	override fun toString(): String = ToStringCreator(this).append("name", this.name)
		.append("type", this.petType).toString()

}

class PetType(name: String) : NamedEntity(name)
