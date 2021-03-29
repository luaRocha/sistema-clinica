package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Tratamento;
import com.veterinaria.sistema.repositories.TratamentoRepository;

@Controller
@RequestMapping("tratamento")
public class TratamentoController {

	@Autowired
	private TratamentoRepository tratamentoRepos;
		
	@RequestMapping("carrega")
	public String carregaTratamento(Model model) {
		
		model.addAttribute("animal", retornaTratamento());
		
		return "animal";		
	}
	
	private List<Tratamento> retornaTratamento(){
		
		 var tratamento = new ArrayList<Tratamento>();
		 tratamentoRepos.findAll().forEach( t -> {
		 		tratamento.add(t);
		 	});
		 
		return tratamento;
	}
}
