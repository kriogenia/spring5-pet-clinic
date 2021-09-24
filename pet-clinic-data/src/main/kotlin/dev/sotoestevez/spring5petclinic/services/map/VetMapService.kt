package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.Vet
import dev.sotoestevez.spring5petclinic.services.VetService
import org.springframework.stereotype.Service

@Service
class VetMapService: AbstractMapService<Vet>(), VetService {}