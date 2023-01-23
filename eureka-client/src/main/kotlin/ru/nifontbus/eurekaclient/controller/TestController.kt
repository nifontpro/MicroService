package ru.nifontbus.eurekaclient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/main")
class TestController {

	@GetMapping("/")
	fun info(): String {
		return "Eureka client"
	}

	@Value("\${eureka.instance.instance-id}")
	private val id: String = "undefined"

	@Value("\${tmpVar}")
	private val tmpVar: Int = -1

	@GetMapping("/test")
	fun test(): String {
		return "test $id, tmpVar=$tmpVar"
	}
}