package com.victoroliveira.friendog.repositories;

import com.victoroliveira.friendog.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogBreedRepository extends JpaRepository<Dog, Integer> {

}
