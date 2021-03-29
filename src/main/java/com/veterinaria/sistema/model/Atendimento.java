package com.veterinaria.sistema.model;

import java.time.LocalDate;


import java.time.LocalTime;
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
public class Atendimento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 20)
	private String consulta; //horaMarcada ou emergencia
	
	private Double valorHoraMarcada;
	
	private Double valorEmergencia;
	
	private LocalDate dataAtendimento;
	
	private LocalTime horaAtendimento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Veterinario veterinario;
	
	@ManyToMany(mappedBy = "atendimentos", fetch = FetchType.LAZY)
	List<Exame> exames = new ArrayList<Exame>();

	public Atendimento() {
	}
	
	public Atendimento(String consulta, Double valorHoraMarcada, Double valorEmergencia,
			LocalDate dataAtendimento, LocalTime horaAtendimento, Veterinario veterinario, List<Exame> exames) {
		this.consulta = consulta;
		this.valorHoraMarcada = valorHoraMarcada;
		this.valorEmergencia = valorEmergencia;
		this.dataAtendimento = dataAtendimento;
		this.horaAtendimento = horaAtendimento;
		this.veterinario = veterinario;
		this.exames = exames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public Double getValorHoraMarcada() {
		return valorHoraMarcada;
	}

	public void setValorHoraMarcada(Double valorHoraMarcada) {
		this.valorHoraMarcada = valorHoraMarcada;
	}

	public Double getValorEmergencia() {
		return valorEmergencia;
	}

	public void setValorEmergencia(Double valorEmergencia) {
		this.valorEmergencia = valorEmergencia;
	}

	public LocalDate getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(LocalDate dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public LocalTime getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(LocalTime horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", consulta=" + consulta + ", valorHoraMarcada=" + valorHoraMarcada
				+ ", valorEmergencia=" + valorEmergencia + ", dataAtendimento=" + dataAtendimento + ", horaAtendimento="
				+ horaAtendimento + ", veterinario=" + veterinario + ", exames=" + exames + "]";
	}	
}
