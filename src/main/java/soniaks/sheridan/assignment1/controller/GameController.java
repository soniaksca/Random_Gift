package soniaks.sheridan.assignment1.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import soniaks.sheridan.assignment1.model.Envelop;

@Controller
public class GameController {

    @GetMapping (value = {"/", "input"})
    public String Input(){
        return "Input";
    }

    @GetMapping("/process")
    public ModelAndView process(@ModelAttribute Envelop envelopClass){
        return new ModelAndView("Output","envelopClass", envelopClass);
    }
}

