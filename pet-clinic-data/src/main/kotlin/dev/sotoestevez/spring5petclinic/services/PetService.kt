package dev.sotoestevez.spring5petclinic.services

import dev.sotoestevez.spring5petclinic.model.Pet

interface PetService: CrudService<Pet, Long> {

}