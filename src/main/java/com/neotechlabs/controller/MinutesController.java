package com.neotechlabs.controller;

import com.neotechlabs.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise")Exercise exercise) {

        System.out.println("Exercise: " + exercise.getMinutes());
        return "addMinutes";

    }

}
