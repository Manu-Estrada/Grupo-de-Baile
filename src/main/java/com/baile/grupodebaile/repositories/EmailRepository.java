package com.baile.grupodebaile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.EmailMessage;

public interface EmailRepository extends JpaRepository<EmailMessage, Long>{
    
}
