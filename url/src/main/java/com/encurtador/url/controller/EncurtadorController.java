package com.encurtador.url.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nossoEncurtador")
public class EncurtadorController {

    @GetMapping("/hello")
    public String olaMundo(){
        return "Olá, Rapaz! Isso é apenas um teste.";
    }
}
