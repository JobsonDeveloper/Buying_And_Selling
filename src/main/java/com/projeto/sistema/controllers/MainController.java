package com.projeto.sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Para o Spring entender que se trata de um controller
public class MainController {
    @GetMapping("/administrative")
    public String accessMain() {
        return "administrative/home";
    }
}