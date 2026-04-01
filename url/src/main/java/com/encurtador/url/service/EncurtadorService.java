package com.encurtador.url.service;

import com.encurtador.url.dto.UrlRequest;
import com.encurtador.url.dto.UrlResponse;
import com.encurtador.url.mapper.UrlMapper;
import com.encurtador.url.model.EncurtadorEntity;
import com.encurtador.url.repository.EncurtadorRepository;
import com.encurtador.url.util.Base62Encoder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EncurtadorService {

    @Autowired
    private final EncurtadorRepository repository;
    private final UrlMapper urlMapper;

    public UrlResponse encurtarUrl(UrlRequest dto){
        // DTO para Entity
        EncurtadorEntity entity = urlMapper.toEntity(dto);
        //salvar (gera id)
        EncurtadorEntity salva = repository.save(entity);
        //usando base62
        String shortCode = Base62Encoder.encode(salva.getId());
        //atualizar entity
        salva.setShortUrl(shortCode);
        //salvar novamente
        repository.save(salva);


        return urlMapper.toResponse(salva);






    }


}
