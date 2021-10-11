package dev.sotoestevez.spring5petclinic.model

data class Vet(
	override val firstName: String,
	override val lastName: String
) : Person(firstName, lastName) {

	val specialties: Set<Specialty>
		get() = mSpecialty
	private val mSpecialty: MutableSet<Specialty> = mutableSetOf()

	fun addSpecialty(specialty: Specialty) = mSpecialty.add(specialty)

	val numberOfSpecialties
		get() = specialties.size

}

class Specialty(name: String) : NamedEntity(name)