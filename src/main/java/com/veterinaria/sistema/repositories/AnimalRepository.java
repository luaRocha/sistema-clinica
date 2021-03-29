package com.veterinaria.sistema.repositories;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.sistema.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}