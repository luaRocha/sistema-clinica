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
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Dono {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 20)
	@NotBlank(message = "O campo CPF não pode ser vazio.")
	private String CPF;

	@Column(length = 50)
	@NotBlank(message = "O campo Nome não pode ser vazio.")
	private String nomeDono;

	@Column(length = 50)
	@NotBlank(message = "O campo Endereço não pode ser vazio.")
	private String endereco;

	@Column (length = 30)
	@NotBlank(message = "O campo Telefone não pode ser vazio.")
	private String telefone;

	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "dono", fetch = FetchType.LAZY)
	List<Animal> animais = new ArrayList<Animal>();

		public Dono() {
		}

	public Dono(String CPF, String nomeDono, String endereco, String telefone, List<Animal> animais) {
		this.CPF = CPF;
		this.nomeDono = nomeDono;
		this.endereco = endereco;
		this.telefone = telefone;
		this.animais = animais;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	@Override
	public String toString() {
		return "Dono [CPF=" + CPF + ", nomeDono=" + nomeDono + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", animais=" + animais + "]";
	}	
}
