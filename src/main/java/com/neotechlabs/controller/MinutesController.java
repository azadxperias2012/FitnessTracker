package com.neotechlabs.controller;

import com.neotechlabs.model.Activity;
import com.neotechlabs.model.Exercise;
import com.neotechlabs.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise")Exercise exercise) {

        System.out.println("Exercise: " + exercise.getMinutes());
        System.out.println("Exercise activity: " + exercise.getActivity());

        return "addMinutes";
//        return "redirect:addMoreMinutes.html";      // New request routed to different mapping
//        return "forward:addMoreMinutes.html";     // Same request routed to different mapping

    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise")Exercise exercise) {
//
//        System.out.println("Exercising: " + exercise.getMinutes());
//        return "addMinutes";
//
//    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {
        return exerciseService.findAllActivities();
    }

}
