package kappa.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

//    @GetMapping("/")
//    public String index(Model m){
//        m.addAttribute("msg", "Hello, World!!");
//
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model m){

        return "index.tiles";
    }
}
