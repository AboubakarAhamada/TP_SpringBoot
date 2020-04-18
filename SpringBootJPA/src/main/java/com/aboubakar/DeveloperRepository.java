package com.aboubakar;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DeveloperRepository extends CrudRepository<Developer, Integer> {
	
	//Find developers by programming language :
	public List<Developer> findByLangage( String langage);
	
	// Find developers who a given number of experience :
	@Query("SELECT d FROM Developer d WHERE d.experience >= :experience")
	public List<Developer>findByExperience(@Param("experience")int experience);

}
