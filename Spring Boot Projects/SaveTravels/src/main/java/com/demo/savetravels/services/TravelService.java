package com.demo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.savetravels.models.Travel;
import com.demo.savetravels.repository.TravelsRepository;



@Service
public class TravelService {
	private TravelsRepository TravelsRepo;
	
	public TravelService(TravelsRepository TravelsRepo) {
		this.TravelsRepo = TravelsRepo;
	}
	
	public List<Travel> allTravels(){
		return TravelsRepo.findAll();
	}
	
	public Travel addTravel(Travel travel) {
		return TravelsRepo.save(travel);
	}
	
	public Travel findTravel(Long id) {
		Optional<Travel> OptionalBurger = TravelsRepo.findById(id);
		if(OptionalBurger.isPresent()){
			return OptionalBurger.get();
		}
		return null;
	}
	
	public Travel updatTravel(Travel travel) {
		return TravelsRepo.save(travel);
	}
	
	 public void deleteTravel(Long id) {
		 TravelsRepo.deleteById(id);
	    	
	    }

}
