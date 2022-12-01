package com.wizardworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class WizardWorldApplication

fun main(args: Array<String>) {
	runApplication<WizardWorldApplication>(*args)

}
