package com.abdelmajidelayachi.skills_tree.controller;

import com.abdelmajidelayachi.skills_tree.service.StudentService;
import com.google.gson.Gson;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/mohammed/v1")
public class MohammedController {

    @Resource(name = "studentService")
    private StudentService studentService;
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> hello() {
        Gson gson = new Gson();

        Map<String, String> map = Map.of("hello", "world");
       map.put("data", gson.toJson(studentService.getAllStudents()));
        return ResponseEntity.ok().body(gson.toJson(map));
    }
}
