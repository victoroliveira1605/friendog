package com.victoroliveira.friendog.services;

import com.victoroliveira.friendog.domain.Dog;
import com.victoroliveira.friendog.repositories.DogBreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DogBreedService {

    private final DogBreedRepository repository;

    @Autowired
    public DogBreedService(DogBreedRepository repository) {
        this.repository = repository;
    }

    public Dog find(Integer id) {
        Optional<Dog> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
