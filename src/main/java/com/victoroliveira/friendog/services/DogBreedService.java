package com.victoroliveira.friendog.services;

import com.victoroliveira.friendog.domain.Dog;
import com.victoroliveira.friendog.repositories.DogBreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Dog> findAll() {
        return repository.findAll();
    }

    public void save(Dog obj) {
        repository.save(obj);
    }

    public Dog update(Dog obj) {
        Dog newObj = find(obj.getId());
        updateData(newObj,obj);
        return repository.save(newObj);
    }

    private void updateData(Dog newObj,Dog obj){
        newObj.setDogbreed(obj.getDogbreed());
    }

    public void delete(Integer id) {
        repository.delete(find(id));
    }
}
