package ru.nifontbus.githubconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class GithubConfigServerApplication

fun main(args: Array<String>) {
	runApplication<GithubConfigServerApplication>(*args)
}
