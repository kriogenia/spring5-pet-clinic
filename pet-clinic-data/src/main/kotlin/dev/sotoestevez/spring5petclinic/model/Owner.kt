package dev.sotoestevez.spring5petclinic.model

data class Owner(
	override val firstName: String,
	override val lastName: String,
	val address: String,
	val city: String,
	val telephone: String
) : Person(firstName, lastName) {

	val pets: Set<Pet>
		get() = mPets
	private val mPets: MutableSet<Pet> = mutableSetOf()

	fun addPet(pet: Pet) = mPets.add(pet)

	val fullName = "$firstName $lastName"

}
