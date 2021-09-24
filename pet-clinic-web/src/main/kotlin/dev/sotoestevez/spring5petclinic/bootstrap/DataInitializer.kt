package dev.sotoestevez.spring5petclinic.bootstrap

import com.github.javafaker.Faker
import dev.sotoestevez.spring5petclinic.model.Owner
import dev.sotoestevez.spring5petclinic.model.Vet
import dev.sotoestevez.spring5petclinic.services.OwnerService
import dev.sotoestevez.spring5petclinic.services.VetService
import dev.sotoestevez.spring5petclinic.services.map.OwnerMapService
import dev.sotoestevez.spring5petclinic.services.map.VetMapService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer(
	private val ownerService: OwnerService = OwnerMapService(),
	private val vetService: VetService = VetMapService(),
	private val faker: Faker = Faker()
): CommandLineRunner {

	override fun run(vararg args: String?) {
		println("Starting data load")
		for (i in 0..5) {
			ownerService.save(Owner(faker.name().firstName(), faker.name().lastName()))
			vetService.save(Vet(faker.name().firstName(), faker.name().lastName()))
		}
		println("Finished data loading")
	}

}