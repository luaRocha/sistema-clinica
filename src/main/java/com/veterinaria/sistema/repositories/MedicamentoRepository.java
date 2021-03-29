package com.veterinaria.sistema.repositories;

import org.springframework.data.repository.CrudRepository;

import com.veterinaria.sistema.model.Medicamento;

public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {

}