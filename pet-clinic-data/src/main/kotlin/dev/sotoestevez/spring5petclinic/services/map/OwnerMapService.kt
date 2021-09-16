package dev.sotoestevez.spring5petclinic.services.map

import dev.sotoestevez.spring5petclinic.model.Owner
import dev.sotoestevez.spring5petclinic.services.OwnerService
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class OwnerMapService: AbstractMapService<Owner>(), OwnerService {

	override fun findByLastName(lastName: String): List<Owner> =
		map.values.stream().filter { it.lastName == lastName }.collect(Collectors.toList())

}