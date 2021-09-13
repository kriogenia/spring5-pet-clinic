package dev.sotoestevez.spring5petclinic.services

import dev.sotoestevez.spring5petclinic.model.Owner

interface OwnerService {

	fun findById(id: Long): Owner
	fun findByLastName(lastName: String): List<Owner>
	fun findAll(): List<Owner>

	fun save(owner: Owner): Owner


}