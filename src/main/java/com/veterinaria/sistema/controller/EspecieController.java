package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.veterinaria.sistema.model.Especie;
import com.veterinaria.sistema.repositories.EspecieRepository;

@Controller
@RequestMapping("especie")
public class EspecieController {

	@Autowired
	private EspecieRepository especieRepos;

	@RequestMapping("carrega")
	public String carregaEspecie(Model model) {

		model.addAttribute("especie", retornaEspecie());

		return "especie";		
	}

	private List<Especie> retornaEspecie(){

		var especie = new ArrayList<Especie>();
		especieRepos.findAll().forEach( t -> {
			especie.add(t);
		});

		return especie;
	}
}
