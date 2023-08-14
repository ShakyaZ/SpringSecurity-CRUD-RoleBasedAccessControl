package com.example.manytomany.controller;
import com.example.manytomany.entity.Student;
import com.example.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/student/save")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/student/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/student/delete/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        studentService.deleteStudent(studentId);
    }
}
