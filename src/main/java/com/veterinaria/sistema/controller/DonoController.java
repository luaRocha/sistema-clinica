package com.veterinaria.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.veterinaria.sistema.model.Animal;
import com.veterinaria.sistema.model.Dono;
import com.veterinaria.sistema.repositories.DonoRepository;

@Controller
@RequestMapping("/dono")
public class DonoController {
	
	@Autowired
	private DonoRepository donoRepos;
		
	@RequestMapping("/carrega")
	public String carregaDono(Model model) {
		
		model.addAttribute("donos", retornaDono());
				
		return "dono";		
	}
	
	@RequestMapping("/novo")
	public String cadastra(Model model) {
		
		model.addAttribute("dono", new Dono());
		model.addAttribute("animais", new Animal());
		
		return "dono/donoCadastra";			
	}
	
	@RequestMapping("/cadastra")
	public String cadastra(@Valid Dono dono, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("erro", "Erro ao realizar o cadastro: " + result.getAllErrors().get(0).getDefaultMessage());
			model.addAttribute("dono", dono);
			return "dono/donoCadastra";
		}

		donoRepos.save(dono);
				
		return "redirect:/dono/carrega";		
	}
		
	private List<Dono> retornaDono(){
		
		 var dono = new ArrayList<Dono>();
		 
		 donoRepos.findAll().forEach( t -> {
		 		dono.add(t);
		 	});
		 
		return dono;
	}
	
	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id, RedirectAttributes redirectAtt) {
		
		donoRepos.deleteById(id);
		
		redirectAtt.addFlashAttribute("sucesso", "Cliente " + id + " removido com sucesso!");
		
		return "redirect:/dono/carrega";
	}
	
	@GetMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {
		
		var donoOptional = donoRepos.findById(id);
		
		if (donoOptional.isPresent()) {
			
			var dono = donoOptional.get();
			
			model.addAttribute("dono", dono);
		}
		
		return "dono/donoCadastra";
	}
}