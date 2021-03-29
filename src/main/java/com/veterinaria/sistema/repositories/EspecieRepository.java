package com.veterinaria.sistema.repositories;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.sistema.model.Especie;

public interface EspecieRepository extends CrudRepository<Especie, Integer> {

}
