package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Especialidade;
import com.veterinaria.sistema.repositories.EspecialidadeRepository;

@Controller
@RequestMapping("especialidade")
public class EspecialidadeController {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepos;
		
	@RequestMapping("carrega")
	public String carregaEspecialidade3(Model model) {
		
		model.addAttribute("especialidade", retornaEspecialidade());
		
		return "especialidade";		
	}
	
	private List<Especialidade> retornaEspecialidade(){
		
		 var especialidade = new ArrayList<Especialidade>();
		 especialidadeRepos.findAll().forEach( t -> {
		 		especialidade.add(t);
		 	});
		 
		return especialidade;
	}
}
