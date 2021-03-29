package com.veterinaria.sistema.repositories;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.sistema.model.Veterinario;

public interface VeterinarioRepository extends CrudRepository<Veterinario, Integer> {

}
