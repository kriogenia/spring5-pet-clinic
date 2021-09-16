package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.BaseEntity
import dev.sotoestevez.spring5petclinic.services.CrudService

abstract class AbstractMapService<T: BaseEntity>: CrudService<T, Long> {

	protected val map: MutableMap<Long, T> = HashMap()

	override fun findAll(): Set<T> =  HashSet(map.values)

	override fun findById(id: Long): T? = map[id]

	override fun save(entity: T): T {
		map[entity.id] = entity
		return entity
	}

	override fun delete(entity: T) = this.deleteById(entity.id)

	override fun deleteById(id: Long) {
		map.remove(id)
	}

}