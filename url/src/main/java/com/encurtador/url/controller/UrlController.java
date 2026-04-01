package com.encurtador.url.controller;

import com.encurtador.url.dto.UrlRequest;
import com.encurtador.url.dto.UrlResponse;
import com.encurtador.url.model.EncurtadorEntity;
import com.encurtador.url.repository.EncurtadorRepository;
import com.encurtador.url.service.EncurtadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;

@RestController
@RequestMapping("/url-barb")
public class UrlController {

    @Autowired
    private EncurtadorRepository repository;
    @Autowired
    private EncurtadorService service;

    @GetMapping("/listar/ar-condionados/menor-valores/brasil")
    public String arCondicionado(){
        return "Isso é um teste, rapaz! (-_-))";
    }
    @GetMapping("/{shortUrl}")
    public ResponseEntity<Void> redirecionar(@PathVariable String shortUrl){
        EncurtadorEntity entity = repository.findByShortUrl(shortUrl)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Url não encontrada!"));
        entity.setClickCount(entity.getClickCount() + 1);
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create(entity.getOriginalUrl()))
                .build();
    }

    @PostMapping("/shorten")
    public UrlResponse encutar(@RequestBody @Valid UrlRequest request){
        return service.encurtarUrl(request);
    }



}
