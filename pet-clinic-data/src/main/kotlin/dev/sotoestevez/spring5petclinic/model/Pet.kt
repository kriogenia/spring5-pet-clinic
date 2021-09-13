package dev.sotoestevez.spring5petclinic.model

import java.time.LocalDateTime

data class Pet(
		val petType: PetType,
		val owner: Owner,
		val birthDate: LocalDateTime
): BaseEntity()

enum class PetType {

}
