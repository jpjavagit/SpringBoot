package com.spring.springboot.model;

import java.io.Serializable;

/**
 * Model Class
 * @author jpjava
 *
 */
public class Contact implements Serializable{

	private static final long serialVersionUID = -105861133535706276L;
	
	public Contact(){
		
	}
	
	public Contact(Long id, String name, int age, String phoneNumber){
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	private Long id;
	
	private String name;
	
	private int age;
	
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
