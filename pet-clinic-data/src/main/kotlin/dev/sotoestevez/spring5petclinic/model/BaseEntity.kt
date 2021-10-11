package dev.sotoestevez.spring5petclinic.model

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

open class BaseEntity: Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = -1L

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is BaseEntity) return false

		if (id != other.id) return false

		return true
	}

	override fun hashCode(): Int {
		return id.hashCode()
	}

}

open class Person(
	open val firstName: String,
	open val lastName: String
): BaseEntity()