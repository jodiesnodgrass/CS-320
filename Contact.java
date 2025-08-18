// Jodie Snodgrass
// 7/11/25
//CS 320
// Module 3 milestone 1: Contact code works to add contact information as long as they are within the correct parameters.


package Contact;

public class Contact {
	//Individual identifiers 
	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String ID, String firstName, String lastName, String phoneNumber, String address) {
		//if the inputs do not meet requirements throw error
		if (ID.length() > 10 && ID == null && firstName == null && firstName.length() > 10 && lastName == null && lastName.length() > 10 && phoneNumber == null && phoneNumber.length() != 10 && address == null && address.length() > 30) {
			throw new IllegalArgumentException("Invalid input.");
		}
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getFirstName() {
		//return firstName
		return firstName;
	
	}
	public String getLastName() {
		return lastName;
	
	}
	public String getPhoneNumber() {
		//return phoneNumber
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getID() {
		//returns input ID
		return ID;
	}
}
	


