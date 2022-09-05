package com.app.controller;

import com.app.model.Student;
import com.fasterxml.jackson.databind.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class StudentController {


    @RequestMapping("welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "SPRING");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt();
        model.addAttribute("studentId", studentId);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        numbers.add(25);
        model.addAttribute("numbers", numbers);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);


        return "student/welcome";
    }
}
