package com.demo.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.dojo.models.Ninja;
import com.demo.dojo.repository.NinjaRepository;

@Service
public class NinjaServices {
	private NinjaRepository ninjaRepo;
	
	public NinjaServices(NinjaRepository ninjaRepo ) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> OptionalNinja = ninjaRepo.findById(id);
		if(OptionalNinja.isPresent()){
			return OptionalNinja.get();
		}
		return null;
}
	
	
	
	
}
