package dev.sotoestevez.spring5petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/vet")
class VetController {

	companion object {
		private const val ROOT = "vet/"
		private const val INDEX = "index"
	}

	@RequestMapping("", "/", "/${INDEX}", "/${INDEX}.html")
	fun list(): String = ROOT + INDEX

}