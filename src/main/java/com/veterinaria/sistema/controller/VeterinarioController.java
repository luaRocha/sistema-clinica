package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinaria.sistema.model.Veterinario;
import com.veterinaria.sistema.repositories.VeterinarioRepository;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {
	@Autowired
	private VeterinarioRepository veterinarioRepos;
		
	@RequestMapping("/carrega")
	public String carregaVeterinario(Model model) {
		
		model.addAttribute("veterinario", retornaVeterinario());
		
		return "veterinario";		
	}
	
	private List<Veterinario> retornaVeterinario(){
		
		 var veterinario = new ArrayList<Veterinario>();
		 veterinarioRepos.findAll().forEach( t -> {
		 		veterinario.add(t);
		 	});
		 
		return veterinario;
	}
}
