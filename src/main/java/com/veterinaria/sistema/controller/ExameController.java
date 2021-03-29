package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Exame;
import com.veterinaria.sistema.repositories.ExameRepository;

@Controller
@RequestMapping("exame")
public class ExameController {

	@Autowired
	private ExameRepository exameRepos;
		
	@RequestMapping("carrega")
	public String carregaExame(Model model) {
		
		model.addAttribute("exame", retornaExame());
		
		return "exame";		
	}
	
	private List<Exame> retornaExame(){
		
		 var exame = new ArrayList<Exame>();
		 exameRepos.findAll().forEach( t -> {
			 exame.add(t);
		 	});
		 
		return exame;
	}
}