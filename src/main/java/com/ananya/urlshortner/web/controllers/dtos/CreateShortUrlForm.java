package com.ananya.urlshortner.web.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
public record CreateShortUrlForm(
        @NotBlank(message= "Original URL is required")
        String originalUrl) {
}
