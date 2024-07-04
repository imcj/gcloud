package me.imcj.gcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GcloudApplication

fun main(args: Array<String>) {
	runApplication<GcloudApplication>(*args)
}
