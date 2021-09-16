package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.Vet
import dev.sotoestevez.spring5petclinic.services.VetService

class VetMapService: AbstractMapService<Vet>(), VetService {}