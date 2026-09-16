package com.ananya.urlshortner.models;

import com.ananya.urlshortner.domain.entites.modles.Role;

public record CreateUserCmd(
        String email,
        String password,
        String name,
        Role role) {
}