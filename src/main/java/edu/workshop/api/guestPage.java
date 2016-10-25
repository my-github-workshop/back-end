package edu.workshop.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class guestPage {

    @GetMapping("/guest")
    public ModelAndView showResult() {
        return new ModelAndView("guest");
    }

}
