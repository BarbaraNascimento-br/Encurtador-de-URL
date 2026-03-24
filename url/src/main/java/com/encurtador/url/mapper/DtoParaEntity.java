package com.encurtador.url.mapper;

import com.encurtador.url.dto.UrlRequest;
import com.encurtador.url.model.EncurtadorEntity;

import java.time.LocalDateTime;

public class DtoParaEntity {

    public static EncurtadorEntity toEntity(UrlRequest request){
        EncurtadorEntity encurtador = new EncurtadorEntity();

        encurtador.setOriginalUrl(request.originalUrl());

        return encurtador;
    }
}
