package com.stuti.StudentManagementSystem;

import com.stuti.StudentManagementSystem.entity.Student;
import com.stuti.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class StudentManagementSystemApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1=new Student("Stuti","Awasthi","stuti@gmail.com");
//        studentRepository.save(student1);
//        Student student2=new Student("Jhanvi","Gupta","jhanvi@gmail.com");
//        studentRepository.save(student2);
//        Student student3=new Student("Shreyanshi","Shukla","shreyanshi@gmail.com");
//        studentRepository.save(student3);

    }
}
