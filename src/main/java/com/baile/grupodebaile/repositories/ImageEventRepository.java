package com.baile.grupodebaile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.ImageEvent;

public interface ImageEventRepository extends JpaRepository<ImageEvent, Long> {
    public ImageEvent findByImage(String image);
}
