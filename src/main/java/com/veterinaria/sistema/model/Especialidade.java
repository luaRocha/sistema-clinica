package com.veterinaria.sistema.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Especialidade {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Nome; 
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	List<Veterinario> veterinarios = new ArrayList<Veterinario>();

	public Especialidade() {
	}

	public Especialidade(String nome, List<Veterinario> veterinarios) {
		Nome = nome;
		this.veterinarios = veterinarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(List<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}

	@Override
	public String toString() {
		return "Especialidade [id=" + id + ", Nome=" + Nome + ", veterinarios=" + veterinarios + "]";
	}
}
