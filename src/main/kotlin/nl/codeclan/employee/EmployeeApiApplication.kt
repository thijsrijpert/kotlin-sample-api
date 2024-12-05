package nl.codeclan.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener


@SpringBootApplication
class EmployeeApiApplication(val repository: EmployeeRepository) {
    @EventListener(ApplicationReadyEvent::class)
    fun init() {
        repository.insert(EmployeeDTO("Pietje"))
    }
}


fun main(args: Array<String>) {
    runApplication<EmployeeApiApplication>(*args)
}

