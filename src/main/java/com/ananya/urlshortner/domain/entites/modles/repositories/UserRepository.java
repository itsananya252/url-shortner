package com.ananya.urlshortner.domain.entites.modles.repositories;

import com.ananya.urlshortner.domain.entites.modles.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long>{
     Optional<User> findByEmail(String email);
}
