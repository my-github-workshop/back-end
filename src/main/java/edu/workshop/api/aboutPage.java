package edu.workshop.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class aboutPage {

    @GetMapping("/about")
    public ModelAndView showResult() {
        System.out.println("testing testing!");
        return new ModelAndView("about");

    }
}
