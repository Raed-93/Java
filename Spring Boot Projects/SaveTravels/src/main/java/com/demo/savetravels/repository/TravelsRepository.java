package com.demo.savetravels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.savetravels.models.Travel;


@Repository
public interface TravelsRepository extends CrudRepository <Travel, Long>{
	List<Travel> findAll();

}
