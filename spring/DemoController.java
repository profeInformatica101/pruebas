package com.example.personas_rest.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Función
    private int suma(int a, int b) {
        return a + b;
    }

    @GetMapping("/decision")
    public String decision(@RequestParam int number) {
        // Mecanismos de decisión
        if (number < 10) {
            return "El número "+number+" es menor que 10";
        } else {
            return "El número "+number+" es mayor o igual a 10";
        }
    }

    @GetMapping("/bucle")
    public int[] bucle() {
        int[] array = new int[10];

        // Bucles
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        return array;
    }

    @GetMapping("/funcion")
    public int funcion() {
        // Uso de funciones
        return suma(5, 3);
    }

    @PostMapping("/formulario")
    public String formulario(@RequestParam String nombre, @RequestParam int edad) {
        // Recuperación y utilización de información proveniente del cliente web
        return "Hola, " + nombre + ". Tienes " + edad + " años.";
    }

}
