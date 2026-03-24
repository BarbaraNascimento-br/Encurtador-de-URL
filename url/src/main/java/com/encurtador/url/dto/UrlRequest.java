package com.encurtador.url.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UrlRequest(
        @NotBlank(message = "A URL não pode estar vazia")
        @Pattern(
                regexp = "^(http|https)://.*$",
                message = "A URL deve começar com http ou https."
        )
        String originalUrl
) {
}
