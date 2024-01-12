package com.demo.savetravels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.savetravels.models.Travel;
import com.demo.savetravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	TravelService travelService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.allTravels();
		model.addAttribute("travels" ,travels);
		return "index.jsp";
	}
	
	@PostMapping("/addTravel")
	public String index(@Valid @ModelAttribute("travel") Travel travel,BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Travel> travels = travelService.allTravels();
			model.addAttribute("travels" ,travels);
			return "index.jsp";
		}
		travelService.addTravel(travel);
		return "redirect:/";
	}
	
	@GetMapping("/eidt/{id}")
	public String eidtTravel(@PathVariable("id") Long id, @ModelAttribute("travel") Travel travel, Model model) {
		model.addAttribute("travel", travelService.findTravel(id));
		return "eidt.jsp";
	}
	
	@PostMapping("/eidt/{id}")
	public String updat(@Valid @ModelAttribute("travel") Travel travel,BindingResult result,@PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("travel" ,travel);
			return "index.jsp";
		}
		travelService.updatTravel(travel);
		return "redirect:/";
	}
	
	@GetMapping("/travel/{id}")
	public String show(Model model, @PathVariable("id") Long id){
	
	 model.addAttribute("travel",travelService.findTravel(id));
		return "show.jsp";
	}
	
    @DeleteMapping("/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
    	travelService.deleteTravel(id);
        return "redirect:/";
    }



}
