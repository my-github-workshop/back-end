package edu.workshop.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ourTeam {

  @GetMapping("/ourTeam")
  public ModelAndView showResult() {
    return new ModelAndView("ourTeam");
  }

}

