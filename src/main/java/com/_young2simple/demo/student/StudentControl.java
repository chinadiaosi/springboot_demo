package com._young2simple.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentControl {

    private StudentService studentService;

    public StudentControl(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
