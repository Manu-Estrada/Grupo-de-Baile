package com.baile.grupodebaile.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    public Optional<User> findByUsername(String username);
}