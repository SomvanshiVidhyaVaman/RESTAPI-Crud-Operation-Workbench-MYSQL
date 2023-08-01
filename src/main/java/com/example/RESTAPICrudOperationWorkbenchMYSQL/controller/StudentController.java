package com.example.RESTAPICrudOperationWorkbenchMYSQL.controller;

import com.example.RESTAPICrudOperationWorkbenchMYSQL.domain.Student;
import com.example.RESTAPICrudOperationWorkbenchMYSQL.repositry.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    StudentRepositry studentRepositry;
    @GetMapping("all")

    public List<Student> getAllStudent()
    {
        List<Student> students = (List<Student>) studentRepositry.findAll();
        return students;

    }
    @PostMapping("add")

    public Student addStudent(@RequestBody Student student){return studentRepositry.save(student);}

    @GetMapping("student/{id}")
    public Optional<Student> getStudentId(@PathVariable int id) {return studentRepositry.findById(id);}
    @PutMapping("update/{id}")
       public Student updatestudent(@RequestBody Student student){return studentRepositry.save(student);}
     @DeleteMapping("delete/{id}")



    public void deleteStudent(@PathVariable int id)
     {
         studentRepositry.deleteById(id);
         System.out.println("Deleted Record successfully");
     }

}
