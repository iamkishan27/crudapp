package com.example.crudapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudapp.entity.Person;
import com.example.crudapp.repository.PersonRepository;

@Service
public class MyService {

	private Logger logger = LoggerFactory.getLogger(MyService.class);

	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public Person updatePerson(Person person) {
		return personRepository.save(person);
	}

	public String deletePerson(Long id) {
		personRepository.deleteById(id);
		return "Person deleted successfully.";
	}

	public List<Person> fetchAllPerson() {
		return personRepository.findAll();
	}

	public Person fetchPersonById(Long id) {
		return personRepository.getOne(id);
	}
}
