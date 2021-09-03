package dev.sotoestevez.spring5petclinic.model

open class Person(
		open val firstName: String,
		open val lastName: String
) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Person) return false

		if (firstName != other.firstName) return false
		if (lastName != other.lastName) return false

		return true
	}

	override fun hashCode(): Int {
		var result = firstName.hashCode()
		result = 31 * result + lastName.hashCode()
		return result
	}

}
