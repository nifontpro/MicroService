package ru.nifontbus.eurekaclient.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

	@GetMapping("/")
	fun info(): String {
		return "Eureka client"
	}

	@GetMapping("/test")
	fun test(): String {
		return "test"
	}
}