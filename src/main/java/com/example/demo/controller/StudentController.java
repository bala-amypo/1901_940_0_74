package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.ResponseEntity;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/postdata")
    public  ResponseEntity<Student> postdata(@@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    
}