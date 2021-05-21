package crudapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.crudapp.controller.MyController;
import com.example.crudapp.entity.Person;
import com.example.crudapp.exception.CustomException;

public class MyServiceTest {

	MyController myController = new MyController();

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
		Person response = myController.savePeson(person);
		assertEquals(response, person);
	}
}
