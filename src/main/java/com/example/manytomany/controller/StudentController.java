package com.example.manytomany.controller;
import com.example.manytomany.entity.Student;
import com.example.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student/save")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

