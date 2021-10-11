package dev.sotoestevez.spring5petclinic.bootstrap

import com.github.javafaker.Faker
import dev.sotoestevez.spring5petclinic.model.*
import dev.sotoestevez.spring5petclinic.services.OwnerService
import dev.sotoestevez.spring5petclinic.services.PetService
import dev.sotoestevez.spring5petclinic.services.VetService
import dev.sotoestevez.spring5petclinic.services.map.OwnerMapService
import dev.sotoestevez.spring5petclinic.services.map.VetMapService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

@Component
class DataInitializer(
	private val ownerService: OwnerService,
	private val petService: PetService,
	private val vetService: VetService,
) : CommandLineRunner {

	private val faker: Faker = Faker()

	override fun run(vararg args: String?) {
		println("# DataInitializer: ----- Starting data load ----")
		for (i in 0..5) {
			val owner = Owner(
				faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(),
				faker.address().city(), faker.phoneNumber().cellPhone()
			)
			for (j in 0..(1..3).random())
				owner.addPet(
					Pet(
						faker.funnyName().name(), PetType(faker.animal().name()),
						toLocalDateTime(faker.date().birthday(0, 15))
					)
				)
			ownerService.save(owner)

			val vet = Vet(faker.name().firstName(), faker.name().lastName())
			for (j in 0..(1..3).random())
				vet.addSpecialty(Specialty(faker.animal().name()))
			vetService.save(vet)
		}
		println("# DataInitializer: --- Finished data loading ---")
		println("# DataInitializer: ----------- Owners ----------")
		ownerService.findAll().forEach { println(it) }
		println("# DataInitializer: ------------ Pets -----------")
		petService.findAll().forEach { println(it) }
		println("# DataInitializer: --------- Pet Types ---------")
		petService.findPetTypes().forEach { println(it) }
		println("# DataInitializer: ------------ Vets -----------")
		vetService.findAll().forEach { println(it) }

	}

	private fun toLocalDateTime(date: Date) = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()

}