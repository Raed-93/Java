package com.demo.dojo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.dojo.models.Dojo;
import com.demo.dojo.models.Ninja;
import com.demo.dojo.services.DojoServices;
import com.demo.dojo.services.NinjaServices;

import jakarta.validation.Valid;
@Controller
public class MainController {
	
	@Autowired
	DojoServices dojoServices;
	
	@Autowired
	NinjaServices ninjaServices;
	
	@GetMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
//		List<Dojo> dojos = dojoServices.allDojos();
//		model.addAttribute("dojos" ,dojos);
		return "index.jsp";
	}
	
	@PostMapping("/addDojo")
	public String index(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		
		if(result.hasErrors()) {

			return "index.jsp";
		}
		dojoServices.addDojo(dojo);
		return "redirect:/ninja";
	}
	
	@GetMapping("/ninja")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoServices.allDojos();
		model.addAttribute("dojos" ,dojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/addNinja")
	public String index(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoServices.allDojos();
			model.addAttribute("dojos" ,dojos);
			return "ninja.jsp";
		}
		ninjaServices.addNinja(ninja);
		return "redirect:/show{dojo.id}";
	}
	
	@GetMapping("/show/{id}")
	public String show (@PathVariable("id") Long id ,Model model) {
//		Ninja ninjas = ninjaServices.findNinja(id);
		Dojo dojo = dojoServices.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}
	
	

}
