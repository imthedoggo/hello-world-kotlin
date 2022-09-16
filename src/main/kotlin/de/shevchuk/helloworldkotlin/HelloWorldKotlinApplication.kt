package de.shevchuk.helloworldkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.bind.Bindable.listOf
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloWorldKotlinApplication

fun main(args: Array<String>) {
	runApplication<HelloWorldKotlinApplication>(*args)
}

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello"),
		Message("2", "World"),
		Message("3", "Kotlin"),
	)
}

data class Message(val id:String?, val text: String)
