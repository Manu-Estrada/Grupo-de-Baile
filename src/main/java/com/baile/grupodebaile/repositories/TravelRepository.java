package com.baile.grupodebaile.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long> {
    List<Travel> findAllByOrderByDatetravelDesc();
}
