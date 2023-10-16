package com.example.thymeleaf.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam
    		(name="name", required=false, 
    		defaultValue="World") String name,
    		Model model) {
        model.addAttribute("name", name); // Añadir el atributo "name" al Model
        return "greeting"; // Retorno del nombre de la vista (un archivo HTML Thymeleaf llamado "greeting")
    }
}
