package com.baile.grupodebaile.repositories;
import com.baile.grupodebaile.models.AboutUs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutUsRepository extends JpaRepository<AboutUs, Long> {
    List<AboutUs> findAllByOrderByPositionAsc();    
}
