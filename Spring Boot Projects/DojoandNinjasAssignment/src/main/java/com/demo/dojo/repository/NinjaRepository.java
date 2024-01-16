package com.demo.dojo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.demo.dojo.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository <Ninja, Long>{
	List<Ninja> findAll();

}
