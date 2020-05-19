package com.jos.dem.solid.dip;

import java.util.List;

public class PersonService {

  public PersonRepository personRepository;

  public void setPersonRepository(PersonRepository personRepository){
    this.personRepository = personRepository;
  }

  public List<Person> getAll(){
    return personRepository.findAll();
  }

}