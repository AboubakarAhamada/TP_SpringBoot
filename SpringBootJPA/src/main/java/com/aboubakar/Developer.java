/**
 * 
 */
package com.aboubakar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Aboubakar
 *
 */

@Entity
public class Developer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String langage;
	private String framework;
	private int experience;

	
	public Developer() {
		
	}

	public Developer(String langage, String framework, int experience) {
		super();
		this.langage = langage;
		this.framework = framework;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getLangage() {
		return langage;
	}

	public void setLangage(String langage) {
		this.langage = langage;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "Developer [langage=" + langage + ", framework=" + framework + ", experience=" + experience + "]";
	}
	
	
	
}
