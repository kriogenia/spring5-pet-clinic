package dev.sotoestevez.spring5petclinic.model

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

open class BaseEntity : Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = -1L

	val isNew: Boolean = id == -1L

}

open class NamedEntity(val name: String) : BaseEntity() {

	override fun toString(): String = name

}

open class Person(
	open val firstName: String,
	open val lastName: String
) : BaseEntity()