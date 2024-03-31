package com.stuti.StudentManagementSystem.service;

import com.stuti.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(long id);
    Student updateStudent(Student student);
    void  deleteStudentById(Long id);
}
