package dev.sotoestevez.spring5petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController {

	companion object {
		private const val BASE_PATH = "vet/"
		private const val INDEX = "index"
	}

	@RequestMapping("vet", BASE_PATH, "$BASE_PATH$INDEX", "$BASE_PATH$INDEX.html")
	fun list(): String = BASE_PATH + INDEX

}