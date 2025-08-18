//Jodie Snodgrass
//7/15/25
//java file works to test methods created in contactservice java file

package Contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ContactServiceTest {

	// Test the add methods.
	@Test
	public void testAdd(){
		//connects to contactservice java to create new contact 
		ContactService cs = new ContactService();
		//adds first contact information contact t1
		Contact t1 = new Contact("111111", "Jeffrey", "Snodgrass", "1112223333", "14 Dragon Fly Ln");
		//as long as accepted adds contact 
		assertEquals(true, cs.addContact(t1));

		}

	//test the delete methods.
	@Test
	public void testDelete(){
		//connects to new contactservice 
		ContactService cs = new ContactService();
		//contacts t1, t2, t3 with unique identifiers from java file contact
		Contact t1 = new Contact("111111", "Jeffrey", "Snodgrass", "1112223333", "14 Dragon Fly Ln");
		Contact t2 = new Contact("222222", "Jason", "Snodgrass", "4445556666", "208 McCully St");
		Contact t3 = new Contact("333333", "Jeremy", "Snodgrass", "7778889999", "424 Carotherss Ave");
		//adds new contacts
		cs.addContact(t1);
		cs.addContact(t2);
		cs.addContact(t3);
		//delete t1 contact
		assertEquals(true, cs.deleteContact("111111"));
	}

	//test the update methods.
	@Test
	public void testUpdate(){
		//connects to new contactservice 
		ContactService cs = new ContactService();
		//contact information that was added
		Contact t1 = new Contact("111111", "Jeffrey", "Snodgrass", "1112223333", "14 Dragon Fly Ln");
		Contact t2 = new Contact("222222", "Jason", "Snodgrass", "4445556666", "208 McCully St");
		Contact t3 = new Contact("333333", "Jeremy", "Snodgrass", "7778889999", "424 Carothers Ave");
		//adds contact t1, t2, and t3
		cs.addContact(t1);
		cs.addContact(t2);
		cs.addContact(t3);
		//update first name of t1
		assertEquals(true, cs.updatePhoneNumber("111111", "5556667777"));
	}

}