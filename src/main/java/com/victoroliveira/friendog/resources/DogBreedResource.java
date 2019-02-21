package com.victoroliveira.friendog.resources;

import com.victoroliveira.friendog.domain.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/dogbreed")
public class DogBreedResource {

    @RequestMapping(method = RequestMethod.GET)
    private List<Dog> listDog() {
        Dog dog = new Dog(1, "Border colie", "Jogar bolinha", "15Anos");
        List<Dog> listDog = new ArrayList<>();
        listDog.add(dog);
        return listDog;
    }
}
