package com.example.manytomany.service;
import com.example.manytomany.entity.Student;
import com.example.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }
}
