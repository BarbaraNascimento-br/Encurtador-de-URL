package com.encurtador.url.dto;

public record UrlResponse(
        String originalUrl,
        String shortUrl,
        Integer numeros_de_clicks

) {}
