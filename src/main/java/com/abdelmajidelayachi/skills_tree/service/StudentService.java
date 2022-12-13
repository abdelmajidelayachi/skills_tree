package com.abdelmajidelayachi.skills_tree.service;


import com.abdelmajidelayachi.skills_tree.entity.Student;
import com.abdelmajidelayachi.skills_tree.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService  {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Transactional
    public Student save(Student student){
        return studentRepository.save(student);
    }
}
