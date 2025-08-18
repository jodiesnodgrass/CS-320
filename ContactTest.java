package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//creates new ID
	Contact contact = new Contact("123456", "John", "Doe", "9990003456", "123 Maple St");
		
	@Test
	void getID() {
		//gets contact by searching ID 
		assertEquals("123456", contact.getID());
	}
	@Test
	void getFirstName() {
		//gets contact by searching first name
		assertEquals("John", contact.getFirstName());
	}
	@Test
	void getLastName() {
		//gets contact by searching last name
		assertEquals("Doe", contact.getLastName());
	}
	@Test
	void getPhoneNumber() {
		//gets contact by searching phone number 
		assertEquals("9990003456", contact.getPhoneNumber());
	}
	@Test
	void getAddress() {
		//gets contact by searching address
		assertEquals("123 Maple St", contact.getAddress());
	}
	
}
