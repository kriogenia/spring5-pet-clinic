package dev.sotoestevez.spring5petclinic.services

interface CrudService<T, ID> {

	fun findAll(): Set<T>

	fun findById(id: ID): T

	fun save(entity: T): Unit

	fun delete(entity: T): Unit

	fun deleteById(id: ID): Unit

}