package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Atendimento;
import com.veterinaria.sistema.repositories.AtendimentoRepository;

@Controller
@RequestMapping("atendimento")
public class AtendimentoController  {
	
	@Autowired
	private AtendimentoRepository atendimentoRepos;
		
	@RequestMapping("carrega")
	public String carregaAtendimento(Model model) {
		
		model.addAttribute("atendimento", retornaAtendimento());
		
		return "atendimento";		
	}
	
	private List<Atendimento> retornaAtendimento(){
		
		 var atendimento = new ArrayList<Atendimento>();
		 atendimentoRepos.findAll().forEach( t -> {
		 		atendimento.add(t);
		 	});
		 
		return atendimento;
	}
}
