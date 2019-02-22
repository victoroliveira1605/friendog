package com.victoroliveira.friendog.resources;

import com.victoroliveira.friendog.domain.Dog;
import com.victoroliveira.friendog.services.DogBreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dogbreed")
public class DogBreedResource {

    private final DogBreedService service;

    @Autowired
    public DogBreedResource(DogBreedService service) {
        this.service = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private ResponseEntity<?> find(@PathVariable Integer id) {
        Dog obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
