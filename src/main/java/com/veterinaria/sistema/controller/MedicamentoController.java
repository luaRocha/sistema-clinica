package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Medicamento;
import com.veterinaria.sistema.repositories.MedicamentoRepository;

@Controller
@RequestMapping("medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoRepository medicamentoRepos;
		
	@RequestMapping("carrega")
	public String carregaMedicamento(Model model) {
		
		model.addAttribute("medicamento", retornaMedicamento());
		
		return "medicamento";		
	}
	
	private List<Medicamento> retornaMedicamento(){
		
		 var medicamento = new ArrayList<Medicamento>();
		 medicamentoRepos.findAll().forEach( t -> {
		 		medicamento.add(t);
		 	});
		 
		return medicamento;
	}
}