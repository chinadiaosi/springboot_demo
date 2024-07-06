package com._young2simple.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Alex",
                        "Chen",
                        LocalDate.now(),
                        17,
                        "chen@ase.com"
                ),
                new Student(
                        "Alex",
                        "Chen",
                        LocalDate.now(),
                        17,
                        "chen@ase.com"
                )
        );
    }
}
