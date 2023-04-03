package com.demo.git.copilotassist.controller

import com.demo.git.copilotassist.model.Employee
import com.demo.git.copilotassist.service.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Rest Controller for Employee
 */
@RestController("/employee")
class EmployeeRestController (private val employeeService: EmployeeService){

    init {
        println("EmployeeRestController initialized")
    }
    /**
     * Get Method to retrieve all employees
     */
    @GetMapping("/list")
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployees()

    /**
     * Get method for saving employee
     */
    @GetMapping("/save")
    fun saveEmployee(): Employee {
        val randomInt = (Math.random() * 100).toInt();
        val employee = Employee(
            name = "Mrinmoy Sen".plus(randomInt),
            email = "mrinmoy@email.com".plus(randomInt),
            address = "Kolkata",
            phone = "9876543210",
            salary = 10000 + randomInt
        )
        return employeeService.saveEmployee(employee)
    }

}