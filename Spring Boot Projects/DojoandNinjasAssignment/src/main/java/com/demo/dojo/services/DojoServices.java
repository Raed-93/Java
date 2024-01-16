package com.demo.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.dojo.models.Dojo;
import com.demo.dojo.repository.DojoRepository;

@Service
public class DojoServices {
	private DojoRepository dojoRepo;
	
	public DojoServices(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
		
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo addDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> OptionalDojo = dojoRepo.findById(id);
		if(OptionalDojo.isPresent()){
			return OptionalDojo.get();
		}
		return null;
}

}
