package com.example.demo.model;

public class Person {
	
	String name;
	int age;
	String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public Person() {
		System.out.println("\n\n\n\n---------------Constructor Invoked-----------\n\n\n\n");
		}
	
	

}
