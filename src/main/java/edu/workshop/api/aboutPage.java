package edu.workshop.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class aboutPage {

    @GetMapping("/about")
    public ModelAndView showResult() {
        return new ModelAndView("about");
    }
}