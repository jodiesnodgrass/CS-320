//Jodie Snodgrass
//7/15/25
//
package Contact;

import java.util.ArrayList;

public class ContactService {
	//creates array list contacts
  private ArrayList<Contact> contacts;

  public ContactService() {
  	//contacts is new array list
      contacts = new ArrayList<>();
  }
//add new contact information
  public boolean addContact(Contact contact) {
  	//if they already exists do not add the contact
      boolean exists = false;
      for (Contact contactList : contacts) {
      	//if they do not exists adds
          if (contactList.getID().equalsIgnoreCase(contact.getID())) {
              exists = true;
              
          }
      }
      if (!exists) {
      	//if doess not exists add contact information
          contacts.add(contact);
          return true;
      } 
      else {
      	//else do not add
          return false;
      }
  }
//set up to remove contact
  public boolean deleteContact(String ID) {
      boolean erased = false;
      for (Contact contactList : contacts) {
      	//if ID exists 
          if (contactList.getID().equalsIgnoreCase(ID)) {
          	//remove that contact from list 
              contacts.remove(contactList);
              erased = true;
              
          }
      }
      return erased;
  }
//set up to update 
  public boolean updatePhoneNumber(String ID, String newPhoneNumber) {
      boolean updated = false;
      for (Contact contactList : contacts) {
      	//if ID exists 
          if (contactList.getID().equalsIgnoreCase(ID)) {
          	//update phoneNumber
              contactList.setPhoneNumber(newPhoneNumber);
              updated = true;
              
          }
      }
      return updated;
  }

}