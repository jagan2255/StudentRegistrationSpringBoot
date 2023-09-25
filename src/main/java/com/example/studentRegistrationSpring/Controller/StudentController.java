package com.example.studentRegistrationSpring.Controller;


import com.example.studentRegistrationSpring.Entity.StudentEntity;
import com.example.studentRegistrationSpring.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/studentdata")

public class StudentController {

  @Autowired
  StudentService studentService;

  @PostMapping(value = "/savestudent")
  private Map<String, Object> saveStudent(@RequestBody StudentEntity students){
    studentService.save(students);
    String result;
    result = students.get_id() ;

    Map<String, Object> response = new HashMap<>();
    response.put("id", result);
    response.put("message", "Success");
    return  response;
  }

  @GetMapping(value = "/getstudents")
  private Iterable<StudentEntity> listAll(@RequestParam(required = false) String sort){
      return studentService.listAll(sort);
  }

}
