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
	private val ownerService: OwnerService,
	private val vetService: VetService,
): CommandLineRunner {

	private val faker: Faker = Faker()

	override fun run(vararg args: String?) {
		println("# DataInitializer: --- Starting data load ---")
		for (i in 0..5) {
			val owner = Owner(faker.name().firstName(), faker.name().lastName())
			ownerService.save(owner.apply { id = faker.number().randomNumber(4, true) })
			val vet = Vet(faker.name().firstName(), faker.name().lastName())
			vetService.save(vet.apply { id = faker.number().randomNumber(4, true) })
		}
		println("# DataInitializer: --- Finished data loading ---")
	}

}