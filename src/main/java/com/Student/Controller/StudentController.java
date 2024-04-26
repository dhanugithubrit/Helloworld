package com.Student.Controller;

import com.Student.Entity.Student;
import com.Student.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired

  private StudentServiceImpl studentimpl;

     @RequestMapping("/add")
    public Student addStudentdetails(@RequestBody Student student){

        return studentimpl.addStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student> getAll(){
         return studentimpl.getAllStudent();
    }

}
