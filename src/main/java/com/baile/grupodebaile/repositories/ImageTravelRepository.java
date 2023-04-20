package com.baile.grupodebaile.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.ImageTravel;

public interface ImageTravelRepository extends JpaRepository<ImageTravel, Long> {
    
}
