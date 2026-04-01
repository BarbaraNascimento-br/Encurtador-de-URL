package com.encurtador.url.mapper;

import com.encurtador.url.dto.UrlRequest;
import com.encurtador.url.dto.UrlResponse;
import com.encurtador.url.model.EncurtadorEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class UrlMapper {

    public EncurtadorEntity toEntity(UrlRequest request){
        EncurtadorEntity encurtador = new EncurtadorEntity();

        encurtador.setOriginalUrl(request.originalUrl());
        encurtador.setClickCount(0);
        encurtador.setCreatedUrl(LocalDateTime.now());

        return encurtador;
    }
    public UrlResponse toResponse(EncurtadorEntity entity){
        String urlShortCompleta = "http://localhost:8080/" + entity.getShortUrl();

        return new UrlResponse(entity.getOriginalUrl(), urlShortCompleta);
    }
}
