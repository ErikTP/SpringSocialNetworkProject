package com.example.springproject3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class javascripttemplateController {

    @GetMapping("/showPage")
    public String showPage(){
        return "javascripttemplate";
    }

}