package com.baile.grupodebaile.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.ImageUser;

public interface ImageUserRepository extends JpaRepository<ImageUser, Long>{
    public ImageUser findByImage(String image);

}