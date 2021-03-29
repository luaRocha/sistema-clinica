package com.veterinaria.sistema.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Exame {

	@Id
	private int codigo;
	
	private String nome;
	
	private String diagnostico;
	
	@OneToMany(mappedBy = "exame", fetch = FetchType.LAZY)
	List<Tratamento> tratamentos = new ArrayList<Tratamento>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	List<Atendimento> atendimentos = new ArrayList<Atendimento>();
	
	public Exame() {
	}

	public Exame(int codigo, String nome, String diagnostico, List<Tratamento> tratamentos,
			List<Atendimento> atendimentos) {
		this.codigo = codigo;
		this.nome = nome;
		this.diagnostico = diagnostico;
		this.tratamentos = tratamentos;
		this.atendimentos = atendimentos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public List<Tratamento> getTratamentos() {
		return tratamentos;
	}

	public void setTratamentos(List<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	@Override
	public String toString() {
		return "Exames [codigo=" + codigo + ", nome=" + nome + ", diagnostico=" + diagnostico + ", tratamentos="
				+ tratamentos + ", atendimentos=" + atendimentos + "]";
	}
}
