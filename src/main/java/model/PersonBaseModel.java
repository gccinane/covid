package model;

import java.util.List;

public class PersonBaseModel {
	List<PersonModel> persons;
	
	
	//Returns all persons from the request model
	public List<PersonModel> getPersons() {
		return persons;
	}
	
	
	//Setter of persons list
	public void setPersons(List<PersonModel> persons) {
		this.persons = persons;
	}
}
