package dev.sotoestevez.spring5petclinic.model

data class Vet(
		override val firstName: String,
		override val lastName: String
): Person(firstName, lastName) {

	val specialty: Set<Specialty>
		get() = mSpecialty
	private val mSpecialty: MutableSet<Specialty> = mutableSetOf()

}

data class Specialty(
	val name: String
): BaseEntity()