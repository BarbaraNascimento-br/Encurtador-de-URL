package com.encurtador.url.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "encurtador")
public class EncurtadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "original_url")
    private String originalUrl;

    @Column(name = "curto_url", unique = true)
    private String shortUrl;

    @Column(name = "data_da_url")
    private LocalDateTime createdUrl;

    @Column(name = "numeros_de_clicks")
    private Integer clickCount = 0;



}
