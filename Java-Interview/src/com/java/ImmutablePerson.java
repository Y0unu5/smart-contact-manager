package com.java;

public final class ImmutablePerson {
	private final String name;
	private final int age;
	private final Address address;

	public ImmutablePerson(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		// Creating a new Address object to ensure the original reference is not exposed
		this.address = new Address(address.getStreet(), address.getCity(), address.getZipCode());
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return new Address(address.getStreet(), address.getCity(), address.getZipCode());
	}

	public static void main(String[] args) {
		Address address = new Address("Main Street", "Gangavathi", "234567");
		ImmutablePerson person = new ImmutablePerson("Yunus", 25, address);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity() + ", "
				+ person.getAddress().getZipCode());

		address.setStreet("456 Elm St");
		System.out.println("\nAfter modifying the original Address object:");

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity() + ", "
				+ person.getAddress().getZipCode());
	}
}

class Address {
	private String street;
	private String city;
	private String zipCode;

	public Address(String street, String city, String zipCode) {

		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}