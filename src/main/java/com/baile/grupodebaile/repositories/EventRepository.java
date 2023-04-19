package com.baile.grupodebaile.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baile.grupodebaile.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAllByOrderByDateeventAsc();
}
