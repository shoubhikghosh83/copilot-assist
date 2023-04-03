package com.demo.git.copilotassist.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 * Document Model for Employee
 */
@Document(collection = "exemployee")
data class Employee(
    @Id
    val id : ObjectId = ObjectId.get(),
    @Field
    val name: String,
    @Field
    val email: String,
    @Field
    val address: String,
    @Field
    val phone: String,
    @Field
    val salary: Int
)
