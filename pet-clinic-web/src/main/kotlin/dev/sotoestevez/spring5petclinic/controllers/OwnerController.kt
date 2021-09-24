package dev.sotoestevez.spring5petclinic.controllers

import dev.sotoestevez.spring5petclinic.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/owner")
class OwnerController(
	private val ownerService: OwnerService
) {

	companion object {
		private const val ROOT = "owner/"
		private const val INDEX = "index"
		private const val OWNERS = "owners"
	}

	@RequestMapping("", "/", "/$INDEX", "/$INDEX.html")
	fun list(model: Model): String {
		model.addAttribute(OWNERS, ownerService.findAll())
		return ROOT + INDEX
	}

}