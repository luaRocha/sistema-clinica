package com.veterinaria.sistema.model;

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

@Entity
public class Medicamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(length = 30)
	private String nome;
	
	private String descricao;
	
	LocalTime horaAplicacao;
	
	@Column(length = 30)
	private String quantidade;
	
	@ManyToMany(fetch = FetchType.LAZY)
	List<Tratamento> tratamentos = new ArrayList<Tratamento>();
	
	public Medicamento() {
	}

	public Medicamento(int codigo, String nome, String descricao, LocalTime horaAplicacao, String quantidade,
			List<Tratamento> tratamentos) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.horaAplicacao = horaAplicacao;
		this.quantidade = quantidade;
		this.tratamentos = tratamentos;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalTime getHoraAplicacao() {
		return horaAplicacao;
	}

	public void setHoraAplicacao(LocalTime horaAplicacao) {
		this.horaAplicacao = horaAplicacao;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public List<Tratamento> getTratamentos() {
		return tratamentos;
	}

	public void setTratamentos(List<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}

	@Override
	public String toString() {
		return "Medicamento [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", horaAplicacao="
				+ horaAplicacao + ", quantidade=" + quantidade + ", tratamentos=" + tratamentos + "]";
	}
}
