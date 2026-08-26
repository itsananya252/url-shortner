package com.ananya.urlshortner.models;

import java.io.Serializable;

public record UserDto(
        Long id,
        String name
) implements Serializable {
}