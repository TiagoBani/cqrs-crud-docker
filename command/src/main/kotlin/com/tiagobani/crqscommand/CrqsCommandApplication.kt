package com.tiagobani.crqscommand

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude=[DataSourceAutoConfiguration::class])
class CrqsCommandApplication

fun main(args: Array<String>) {
	runApplication<CrqsCommandApplication>(*args)
}
