package com.veterinaria.sistema.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Especie {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50)
	private String nome;

	private Double altura;
	
	@Column(length = 20)
	private String expectativaDeVida;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "especie", fetch = FetchType.LAZY)
	List<Animal> animais = new ArrayList<Animal>();
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	List<Veterinario> veterinarios = new ArrayList<Veterinario>();
	
	public Especie() {
	}

	public Especie(String nome, Double altura, String expectativaDeVida, List<Animal> animais,
			List<Veterinario> veterinarios) {
		this.nome = nome;
		this.altura = altura;
		this.expectativaDeVida = expectativaDeVida;
		this.animais = animais;
		this.veterinarios = veterinarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getExpectativaDeVida() {
		return expectativaDeVida;
	}

	public void setExpectativaDeVida(String expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(List<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}

	@Override
	public String toString() {
		return "Especie [id=" + id + ", nome=" + nome + ", altura=" + altura + ", expectativaDeVida="
				+ expectativaDeVida + ", animais=" + animais + ", veterinarios=" + veterinarios + "]";
	}
}
