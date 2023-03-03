package com.artemii.loppu_tehtava.StudentRestController;

import com.artemii.loppu_tehtava.service.StudentService;
import com.artemii.loppu_tehtava.data.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
    StudentService pc;

    @Autowired
    public StudentRestController(StudentService pc) {
        this.pc = pc;
    }

    @GetMapping("/students")
    public List<student> getStudents() {
        return pc.getstudents();
    }

    @PostMapping("/student")
    public String addStudent(@RequestParam student prod) {
        pc.Addstudent(prod);
        return "Student added";
    }

    @DeleteMapping("/delstudent")
    public String deleteStudent(@RequestParam student prod) {
        pc.removestudent(prod.getId());
        return "Student removed";
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<student> getStudent(@PathVariable int id) {
        student p = pc.findstudent(id);
        if (p != null) {
            return new ResponseEntity<>(p, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
