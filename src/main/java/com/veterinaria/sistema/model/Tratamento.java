package com.veterinaria.sistema.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Tratamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 50)
	private String nomeTratamento;
	
	@ManyToMany(mappedBy = "tratamentos", fetch = FetchType.LAZY)
	List<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Exame exame;
	
	public Tratamento() {
	}

	public Tratamento(String nomeTratamento, List<Medicamento> medicamentos, Exame exame) {
		super();
		this.nomeTratamento = nomeTratamento;
		this.medicamentos = medicamentos;
		this.exame = exame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeTratamento() {
		return nomeTratamento;
	}

	public void setNomeTratamento(String nomeTratamento) {
		this.nomeTratamento = nomeTratamento;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	@Override
	public String toString() {
		return "Tratamento [id=" + id + ", nomeTratamento=" + nomeTratamento + ", medicamentos=" + medicamentos
				+ ", exame=" + exame + "]";
	}
}
