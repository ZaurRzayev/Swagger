package com.example.learnspring.controller;

import com.example.learnspring.model.StudentDto;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @PostMapping("greeting")
    public String greeting(@Valid @RequestBody StudentDto studentDto, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "Binding result";
        }
        System.out.println(studentDto);
        return studentDto.toString();
    }
}
