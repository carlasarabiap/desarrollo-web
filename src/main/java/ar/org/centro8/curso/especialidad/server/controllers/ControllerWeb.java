package ar.org.centro8.curso.especialidad.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/calculadoraForm")
    public String getSumar(){
        return "calculadoraForm";
    }
}
