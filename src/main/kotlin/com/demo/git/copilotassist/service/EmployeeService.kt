package com.demo.git.copilotassist.service

import com.demo.git.copilotassist.model.Employee
import com.demo.git.copilotassist.repository.EmployeeRepository

import org.springframework.stereotype.Service

/**
 * Service for Employee
 * @author Mrinmoy Sen
 */
@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    init {
        println("EmployeeService initialized")
    }
    /**
     * Get all employees
     */
    fun getAllEmployees(): List<Employee> {
        return employeeRepository.findAll()
    }

    /**
     * Save employee
     */
    fun saveEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }
}