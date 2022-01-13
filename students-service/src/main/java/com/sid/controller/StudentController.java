package com.sid.controller;

import com.sid.model.Student;
import com.sid.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;



    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Long id ){
        return studentService.getStudent(id);
    }


    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @DeleteMapping("/students")
    public void deleteAllStudents(){
        studentService.deleteAllStudents();
    }


}
