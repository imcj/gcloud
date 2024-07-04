package me.imcj.gcloud.interfaces.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class IndexController {

    @GetMapping("/")
    fun index(): String {
        return "OK"
    }
}