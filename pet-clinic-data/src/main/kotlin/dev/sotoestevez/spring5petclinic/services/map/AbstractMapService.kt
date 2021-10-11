package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.BaseEntity
import dev.sotoestevez.spring5petclinic.services.CrudService
import java.util.*
import kotlin.NoSuchElementException
import kotlin.collections.HashMap
import kotlin.collections.HashSet

abstract class AbstractMapService<T : BaseEntity> : CrudService<T, Long> {

	protected val map: MutableMap<Long, T> = HashMap()

	override fun findAll(): Set<T> = HashSet(map.values)

	override fun findById(id: Long): T? = map[id]

	override fun save(entity: T): T = saveOnMap(entity, map)

	override fun delete(entity: T) = this.deleteById(entity.id)

	override fun deleteById(id: Long) {
		map.remove(id)
	}

	protected fun <S : BaseEntity> saveOnMap(entity: S, map: MutableMap<Long, S>): S {
		if (entity.isNew) entity.id = getNextId(map)
		map[entity.id] = entity
		return entity
	}

	private fun getNextId(map: Map<Long, Any>): Long {
		return try {
			Collections.max(map.keys) + 1
		} catch (exception: NoSuchElementException) {
			0L
		}
	}

}