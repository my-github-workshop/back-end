package edu.workshop.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexPage {

  @GetMapping("/")
  public ModelAndView showResult() {
    System.out.println("let's get wild");
    return new ModelAndView("index");
  }
  

}


