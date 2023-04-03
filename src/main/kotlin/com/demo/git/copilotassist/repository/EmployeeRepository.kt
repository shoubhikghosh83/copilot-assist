package com.demo.git.copilotassist.repository

import com.demo.git.copilotassist.model.Employee
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//@Repository
interface EmployeeRepository : MongoRepository<Employee, String> {
}