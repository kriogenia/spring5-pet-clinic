package dev.sotoestevez.spring5petclinic.services

import dev.sotoestevez.spring5petclinic.model.Vet

interface VetService {

	fun findById(id: Long): Vet
	fun findAll(): List<Vet>

	fun save(vet: Vet): Vet

}