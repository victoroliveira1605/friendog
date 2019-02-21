package com.victoroliveira.friendog.domain;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {
    public static final long serialVersionUID = 1L;
    private Integer id;
    private String dogbreed;
    private String features;
    private String life;

    public Dog() {
    }

    public Dog(Integer id, String dogbreed, String features, String life) {
        super();
        this.id = id;
        this.dogbreed = dogbreed;
        this.features = features;
        this.life = life;
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

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
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