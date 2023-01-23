package ru.nifontbus.eurekaclientnetty.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

	@GetMapping("/")
	suspend fun info(): String {
		return "Eureka client Netty"
	}

	@GetMapping("/test")
	suspend fun test(): String {
		return "test netty"
	}
}