package com.spring.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot.model.Contact;

@SpringBootApplication
@RestController
public class SpringBootExample {
	
	private List<Contact> contacts;
	
	/**
	 * Get the contacts in Json Format
	 * @return List<Contact>
	 */
	@RequestMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getContacts(){
		
		contacts = new ArrayList<Contact>();
		
		contacts.add(new Contact(1L, "Jones", 23, "77 - 3333 - 0983"));
		contacts.add(new Contact(2L, "Monica", 22, "77 - 3333 - 2342"));
		contacts.add(new Contact(3L, "Jesse", 30, "32 - 2323 - 0983"));
		contacts.add(new Contact(4L, "Jefrey", 32, "98 - 3333 - 0983"));
		
		return contacts;
	}
	
	/**
	 * Main Method - The Magic happens here!
	 * @param args : String[]
	 */
	public static void main(String[] args){
		SpringApplication.run(SpringBootExample.class, args);
	}


	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
