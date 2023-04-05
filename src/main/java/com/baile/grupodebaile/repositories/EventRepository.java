package com.baile.grupodebaile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
