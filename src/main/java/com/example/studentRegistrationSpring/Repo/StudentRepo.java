package com.example.studentRegistrationSpring.Repo;

import com.example.studentRegistrationSpring.Entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<StudentEntity , String> {
}
