package com.victoroliveira.friendog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Dog implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dogbreed;

    public Dog() {
    }

    public Dog(Integer id, String dogbreed) {
        super();
        this.id = id;
        this.dogbreed = dogbreed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDogbreed() {
        return dogbreed;
    }

    public void setDogbreed(String dogbreed) {
        this.dogbreed = dogbreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id.equals(dog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
