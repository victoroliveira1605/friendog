package com.victoroliveira.friendog.resources;

import com.victoroliveira.friendog.domain.Dog;
import com.victoroliveira.friendog.services.DogBreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    private ResponseEntity<?> create(@RequestBody Dog obj) {
        service.save(obj);
        return ResponseEntity.ok().body("Dog created");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    private ResponseEntity<?> update(@RequestBody Dog obj, @PathVariable Integer id) {
        Dog newObj = new Dog(id,obj.getDogbreed());
        service.update(newObj);
        return ResponseEntity.ok().body("Dog updated");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    private ResponseEntity<?> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok().body("deleted successfully");
    }
}
