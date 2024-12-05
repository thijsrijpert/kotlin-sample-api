package nl.codeclan.employee

import org.springframework.stereotype.Service
import org.springframework.jdbc.core.JdbcTemplate

@Service
class EmployeeRepository(private val db: JdbcTemplate) {
    fun findMessages(): List<EmployeeDTO> =
        db.query("select * from employees") { response, _ ->
            EmployeeDTO(response.getString("name"))
        }

    fun insert(EmployeeDTO : EmployeeDTO) =
        db.update(
            "insert into employees(name) values (?)",
            EmployeeDTO.name
        )
}