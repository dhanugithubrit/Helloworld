package com.Student.Service;

import com.Student.DAO.StudentDAO;
import com.Student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired

   private StudentDAO studentdao;

//    Student stu=new Student(1,"Dh",80);
    @Override
    public Student addStudent(Student student) {
        return studentdao.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentdao.findAll();
    }
}
