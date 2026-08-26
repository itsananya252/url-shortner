package com.ananya.urlshortner.domain.entites.modles.exceptions;

public class ShortUrlNotFoundException extends RuntimeException {
    public ShortUrlNotFoundException(String message) {
        super(message);

     }
}

