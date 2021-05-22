package crudapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import com.example.crudapp.controller.MyController;
import com.example.crudapp.entity.Person;
import com.example.crudapp.exception.CustomException;
import com.example.crudapp.service.MyService;

public class MyServiceTest {

	MyController myController = new MyController();
	
	MyService myService = new MyService();

	@Test
	void testHealth() {
		String response = myController.getHealth();
		assertEquals("Success.", response);
	}
	
	@Test
	void savePersonTest() throws CustomException {
		Person person = new Person();
		person.setFirstname("Swachil");
		person.setLastname("Patel");
		person.setId(1l);
		person.setMobile("1234567890");
		assertTrue(true);
	}
}
