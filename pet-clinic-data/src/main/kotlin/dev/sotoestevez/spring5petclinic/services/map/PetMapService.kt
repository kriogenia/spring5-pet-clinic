package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.Pet
import dev.sotoestevez.spring5petclinic.services.PetService

class PetMapService: AbstractMapService<Pet>(), PetService {}