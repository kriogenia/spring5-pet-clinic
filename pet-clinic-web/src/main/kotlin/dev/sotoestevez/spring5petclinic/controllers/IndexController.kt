package dev.sotoestevez.spring5petclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

	companion object {
		private const val INDEX = "index"
	}

	@RequestMapping("", "/", "index", "index.html")
	fun index(): String = INDEX

}