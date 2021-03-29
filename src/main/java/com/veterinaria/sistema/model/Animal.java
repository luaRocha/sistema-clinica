package com.veterinaria.sistema.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 30)
	private String nomeAnimal;
		
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Especie especie;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Dono dono;

	public Animal() {
	}

	public Animal(String nomeAnimal, Especie especie, Dono dono) {
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.dono = dono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nomeAnimal=" + nomeAnimal + ", especie=" + especie + ", dono=" + dono
				+ "]";
	}
}
