package nl.codeclan.employee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val repo: EmployeeRepository) {
    @GetMapping("/")
    fun index() = repo.findMessages()
}
