package com.baile.grupodebaile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}