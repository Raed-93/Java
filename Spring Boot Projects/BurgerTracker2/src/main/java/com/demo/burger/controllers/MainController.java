package com.demo.burger.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.burger.models.Burger;
import com.demo.burger.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers" ,burgers);
		return "index.jsp";
	}
	
	@PostMapping("/addBurger")
	public String index(@Valid @ModelAttribute("burger") Burger burger,BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
			model.addAttribute("burgers" ,burgers);
			return "index.jsp";
		}
		burgerService.addBurger(burger);
		return "redirect:/";
	}
	
	@GetMapping("/eidt/{id}")
	public String eidtBurger(@PathVariable("id") Long id, @ModelAttribute("burger") Burger burger, Model model) {
		model.addAttribute("burger", burgerService.findBurger(id));
		return "eidt.jsp";
	}
	
	@PostMapping("/eidt/{id}")
	public String updat(@Valid @ModelAttribute("burger") Burger burger,BindingResult result,@PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("burger" ,burger);
			return "index.jsp";
		}
		burgerService.updatBurger(burger);
		return "redirect:/";
	}


}
