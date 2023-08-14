package com.example.manytomany.service;
import com.example.manytomany.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(int studentId);

}
