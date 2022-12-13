package com.abdelmajidelayachi.skills_tree.controller;

import com.abdelmajidelayachi.skills_tree.entity.Student;
import com.abdelmajidelayachi.skills_tree.service.StudentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAll() {
         Gson gson = new Gson();
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok().body(gson.toJson(students));
    }

    @GetMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> create(@ModelAttribute("student") Student student) {
        Gson gson = new Gson();
       // studentService.save(student);
        Map<String, String> map = Map.of("status", "true");
        map.put("statusText", "success");
        map.put("data", gson.toJson(student));
        return ResponseEntity.ok().body(gson.toJson(map));
    }

    

}
