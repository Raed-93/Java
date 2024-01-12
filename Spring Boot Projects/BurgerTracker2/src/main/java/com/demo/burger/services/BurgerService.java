package com.demo.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.burger.models.Burger;
import com.demo.burger.repository.BurgerRepository;

@Service
public class BurgerService {
	private BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	public Burger addBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	
	public Burger findBurger(Long id) {
		Optional<Burger> OptionalBurger = burgerRepo.findById(id);
		if(OptionalBurger.isPresent()){
			return OptionalBurger.get();
		}
		return null;
	}
	
	public Burger updatBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	

}
