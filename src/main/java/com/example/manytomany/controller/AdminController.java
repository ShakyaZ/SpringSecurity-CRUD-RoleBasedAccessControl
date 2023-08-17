package com.example.manytomany.controller;
import com.example.manytomany.producer.RabbitMQJsonProducer;
import com.example.manytomany.entity.Student;
import com.example.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private StudentService studentService;
    private RabbitMQJsonProducer jsonProducer;
    public AdminController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }
    @GetMapping("/student/all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping("/student/save")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        jsonProducer.sendJsonMessage(student);
        return ResponseEntity.ok("Json format details sent to rabbitmq.....");
    }
    @PutMapping("/student/update")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        jsonProducer.sendJsonMessage(student);
        return ResponseEntity.ok("Json format details sent to rabbitmq.....");
    }
    @DeleteMapping("/student/delete/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        studentService.deleteStudent(studentId);
    }
}
