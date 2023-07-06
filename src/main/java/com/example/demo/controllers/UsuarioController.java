package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController{

    @RequestMapping(value = "prueba")
    public String Prueba(){
        return "Hola Mundo";
    }
    
}