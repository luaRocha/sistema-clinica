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
import com.veterinaria.sistema.repositories.AnimalRepository;

@Controller
@RequestMapping("/animal")
public class AnimalController {
	
	@Autowired
	private AnimalRepository animalRepos;
		
	@RequestMapping("/carrega")
	public String carregaAnimal(Model model) {
		
		model.addAttribute("animais", retornaAnimal());
		
		return "animal";		
	}
	
	@RequestMapping("/novo")
	public String cadastra(Model model) {
		
		model.addAttribute("animal", new Dono());
		
		return "animal/animalCadastra";			
	}
	
	@RequestMapping("/cadastra")
	public String cadastra(@Valid Animal animal, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("erro", "Erro ao realizar o cadastro: " + result.getAllErrors().get(0).getDefaultMessage());
			model.addAttribute("animal", animal);
			return "animal/animalCadastra";
		}

		animalRepos.save(animal);
				
		return "redirect:/animal/carrega";		
	}
	
	private List<Animal> retornaAnimal(){
		
		 var animal = new ArrayList<Animal>();
		 	animalRepos.findAll().forEach( t -> {
		 		animal.add(t);
		 	});
		 
		return animal;
	}
	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id, RedirectAttributes redirectAtt) {
		
		animalRepos.deleteById(id);
		
		redirectAtt.addFlashAttribute("sucesso", "Cliente " + id + " removido com sucesso!");
		
		return "redirect:/animal/carrega";
	}
	
	@GetMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {
		
		var donoOptional = animalRepos.findById(id);
		
		if (donoOptional.isPresent()) {
			
			var animal = donoOptional.get();
			
			model.addAttribute("animal", animal);
		}
		
		return "animal/animalCadastra";
	}
}
