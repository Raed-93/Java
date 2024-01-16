package com.demo.dojo.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dojo.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository <Dojo, Long>{
	List<Dojo> findAll();

}
