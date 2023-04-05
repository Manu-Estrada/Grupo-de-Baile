
package com.baile.grupodebaile.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.baile.grupodebaile.models.Event;

@RestController
@RequestMapping(path = "/api")

public class EventController {
    
    private EventService service;

    public EventController(EventService service) {
        this.service = service;
}

@PostMapping(path = "/register", consumes = { "*/*" })
    public ResponseEntity<Map<String, String>> save(@RequestBody Event event) {

        try {
            if (user.getPassword() == null) {
                user.setPassword("1");
            }
            Event userDB = service.store(event);
            Map<String, String> json = new HashMap<>();

            json.put("user", userDB.getName());
            json.put("message", "successful sign up");
            return ResponseEntity.status(HttpStatus.CREATED).body(json);
        } catch (Exception e) {
            Map<String, String> json = new HashMap<>();

            json.put("problem", e.getMessage());
            json.put("message", "Error to sign up");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(json);
        }    
}


@PostMapping("/register/{id}/imagesevent")
public void storeImageEvent(@RequestParam("image") MultipartFile multipartFile, @PathVariable Long id) throws IOException {
    service.saveImageEvent(multipartFile, id);
}

@DeleteMapping("/register/{idevent}/imagesevent")
    public void deleteImageEvent(@PathVariable Long idevent) throws IOException {
        service.deleteImageEvent(idevent);
    }


    @GetMapping("/events")
    public List<Event> listAll() {
        return service.listAll();
    }


    @GetMapping("/events/{id}")
    public Event listOne(@PathVariable Long id) {
        return service.listOne(id);
    }

    @DeleteMapping("/events/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    
    @PutMapping("/events/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody Event event) {
        try {
            event.setId(id);
            service.store(event);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}