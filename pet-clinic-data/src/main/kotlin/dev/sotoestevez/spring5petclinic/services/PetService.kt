package dev.sotoestevez.spring5petclinic.services

import dev.sotoestevez.spring5petclinic.model.Pet

interface PetService {

	fun findById(id: Long): Pet
	fun findAll(): List<Pet>

	fun save(pet: Pet): Pet

}