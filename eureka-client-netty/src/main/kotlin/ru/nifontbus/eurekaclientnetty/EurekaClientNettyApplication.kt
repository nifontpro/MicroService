package ru.nifontbus.eurekaclientnetty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaClientNettyApplication

fun main(args: Array<String>) {
	runApplication<EurekaClientNettyApplication>(*args)
}
