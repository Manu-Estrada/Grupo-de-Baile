package com.baile.grupodebaile.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baile.grupodebaile.models.Travel;
import com.baile.grupodebaile.repositories.TravelRepository;

@Service
public class TravelService {
    private TravelRepository repository;

    @Autowired

    public TravelService(TravelRepository repository) {
        this.repository = repository;
    }

    public Travel save(Travel travelNew) {
        return repository.save(travelNew);
    }

    public List<Travel> listAll() {
        return repository.findAllByOrderByDatetravelAsc();
    }

    public Travel listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Travel update(Long id, Travel travelNew) {
        Travel travelToUpdate = travelNew;
        travelToUpdate.setId(id);
        return repository.save(travelToUpdate);
    }
}
