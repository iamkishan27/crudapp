package com.example.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudapp.entity.Person;
import com.example.crudapp.exception.CustomException;
import com.example.crudapp.service.MyService;

@RestController
@RequestMapping("/person")
public class MyController {

	@Autowired
	private MyService myService;

	@GetMapping("/hello")
	public String getHealth() {
		return "Success.";
	}

	@PostMapping("/saveperson")
	public Person savePeson(@RequestBody Person person) throws CustomException {
		Person savedPerson = myService.savePerson(person);
		return savedPerson;
	}

	@PutMapping("/updateperson")
	public Person updatePerson(@RequestBody Person person) {
		return myService.updatePerson(person);
	}

	@DeleteMapping("/personbyid")
	public String deletePerson(@RequestParam(value = "id") Long id) throws CustomException {
		return myService.deletePerson(id);
	}

	@GetMapping("/all")
	public List<Person> fetchAllPerson() {
		return myService.fetchAllPerson();
	}

	@GetMapping("/personbyid")
	public Person fetchPersonById(@RequestParam(value = "id") Long id) {
		return myService.fetchPersonById(id);
	}

}
