//package com.example.manytomany.controller;
//
//import com.example.manytomany.config.RabbitMQJsonProducer;
//import com.example.manytomany.entity.Student;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class MessageJsonController {
//
//    private RabbitMQJsonProducer jsonProducer;
//    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
//        this.jsonProducer = jsonProducer;
//    }
//
//    @PostMapping("/post")
//    public ResponseEntity<String> sendJsonMessage(@RequestBody Student student) {
//        jsonProducer.sendJsonMessage(student);
//        return ResponseEntity.ok("Json message sent to rabbitmq.....");
//
//    }
//}
