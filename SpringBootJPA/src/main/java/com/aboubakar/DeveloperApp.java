package com.aboubakar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeveloperApp implements CommandLineRunner {

	@Autowired
	DeveloperRepository repository;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeveloperApp.class, args);
		

	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Insert into database:
//		repository.save(new Developer("Java","Hiberante, Spring",12));
//		repository.save( new Developer("C#","ASP.NET, Entity Framwork",12));
//		repository.save(new Developer("PHP", "Laravel, Zend", 10));
//		repository.save(new Developer("Java","Hiberante, Spring Boot",5));
//		repository.save(new Developer("Python","Django",5));
//		repository.save(new Developer("JavaScript","jQuery, ReactJS",2));
//		repository.save(new Developer("JvaScript","AngularJS, Vue.js",1));
		
		// Find all developper :
		Iterable<Developer> listDevelopers = repository.findAll();
		System.out.println("=========== List of all developers ============ :");
		listDevelopers.forEach(developer -> System.out.println(developer.toString()));
		System.out.print("\n");

		//Find By programming langage :
		Iterable<Developer> javaDevelopers = repository.findByLangage("Java");
		System.out.println("=========== List of Java Developers ============ :");
		javaDevelopers.forEach(developer -> System.out.println(developer.toString()));
		System.out.print("\n");
		
		// Find seniors developers (experience >=10) :
		Iterable<Developer> seniorDevelopers = repository.findByExperience(10);
		System.out.println("======List of Senior Developers (>=10 years)========== :");
		seniorDevelopers.forEach(developer -> System.out.println(developer.toString()));
		System.out.print("\n");

		
	}

}
