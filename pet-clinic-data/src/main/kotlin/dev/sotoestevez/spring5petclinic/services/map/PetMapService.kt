package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.Pet
import dev.sotoestevez.spring5petclinic.model.PetType
import dev.sotoestevez.spring5petclinic.services.PetService
import org.springframework.stereotype.Service

@Service
class PetMapService: AbstractMapService<Pet>(), PetService {

	override fun findPetTypes(): List<PetType> = map.values.map { it.petType }.toList()

}