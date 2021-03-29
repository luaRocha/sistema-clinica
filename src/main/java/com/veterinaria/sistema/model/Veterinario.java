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
public class Veterinario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int CRV;
	
	private int idade;
	
	private String email;
	
	@Column (length = 30)
	private String nomeVet;
	
	@Column (length = 30)
	private String telefone;
	
	@Column (length = 50)
	private String endereco; 
	
	@Column (length = 50)
	private String diaTrabalho;
	
	@Column (length = 50)
	private String horaTrabalho;
	
	@ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "veterinarios", fetch = FetchType.LAZY)
	List<Especie> especies = new ArrayList<Especie>();
	
	@ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "veterinarios", fetch = FetchType.LAZY)
	List<Especialidade> especialidades = new ArrayList<Especialidade>();
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "veterinario", fetch = FetchType.LAZY)
	List<Atendimento> atendimentos = new ArrayList<Atendimento>();

	public Veterinario() {
	}
	
	public Veterinario(int cRV, int idade, String email, String nomeVet, String telefone, String endereco,
			String diaTrabalho, String horaTrabalho, List<Especie> especies, List<Especialidade> especialidades,
			List<Atendimento> atendimentos) {
		CRV = cRV;
		this.idade = idade;
		this.email = email;
		this.nomeVet = nomeVet;
		this.telefone = telefone;
		this.endereco = endereco;
		this.diaTrabalho = diaTrabalho;
		this.horaTrabalho = horaTrabalho;
		this.especies = especies;
		this.especialidades = especialidades;
		this.atendimentos = atendimentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCRV() {
		return CRV;
	}

	public void setCRV(int cRV) {
		CRV = cRV;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeVet() {
		return nomeVet;
	}

	public void setNomeVet(String nomeVet) {
		this.nomeVet = nomeVet;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDiaTrabalho() {
		return diaTrabalho;
	}

	public void setDiaTrabalho(String diaTrabalho) {
		this.diaTrabalho = diaTrabalho;
	}

	public String getHoraTrabalho() {
		return horaTrabalho;
	}

	public void setHoraTrabalho(String horaTrabalho) {
		this.horaTrabalho = horaTrabalho;
	}

	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Veterinario [id=" + id + ", CRV=" + CRV + ", idade=" + idade + ", email=" + email + ", nomeVet="
				+ nomeVet + ", telefone=" + telefone + ", endereco=" + endereco + ", diaTrabalho=" + diaTrabalho
				+ ", horaTrabalho=" + horaTrabalho + ", especies=" + especies + ", especialidades=" + especialidades
				+ ", atendimentos=" + atendimentos + "]";
	}
}
