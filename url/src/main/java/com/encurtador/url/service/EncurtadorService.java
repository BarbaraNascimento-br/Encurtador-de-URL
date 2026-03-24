package com.encurtador.url.service;

import com.encurtador.url.dto.UrlRequest;
import com.encurtador.url.dto.UrlResponse;
import com.encurtador.url.repository.EncurtadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EncurtadorService {

    @Autowired
    private final EncurtadorRepository repository;



    public UrlResponse encurtarUrl(UrlRequest dto){

    }


}
