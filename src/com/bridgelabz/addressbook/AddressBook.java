package com.bridgelabz.addressbook;

import java.util.*;
public class AddressBook {

	private String phoneNumber;
	private String FirstName;
	private String LastName;
	private String Address;
	private String Zip;
	private String email;
	
	class Book{
		private String FirstName;
		private String LastName;
		private String Address;
		private String Zip;
		private double phoneNumber;
		private String email;
		int members = 0;
		
		public Book(String firstName, String lastName, String address, 
					double phoneNumber,String Zip ,String email) {
			super();
			this.FirstName = firstName;
			this.LastName = lastName;
			this.Address = address;
			this.Zip = Zip;
			this.phoneNumber = phoneNumber;
			this.email = email;
			members++;
			
		}
		
		
		public void readBook() {
			System.out.println("First Name"+FirstName);
			System.out.println("Last Name"+LastName);
			System.out.println("Address"+Address);
			System.out.println("Zip"+Zip);
			System.out.println("Phone Number"+phoneNumber);
			System.out.println("Email ID"+email);
		}
		
		public String getFirstName() {
			return FirstName;
			}
		
		public String getLastName() {
			return LastName;
			}
		
		public String getAddress() {
			return Address;
			}
		
		public String getZip() {
			return Zip;
			}
		
		public double getPhoneNumber() {
			return phoneNumber;
			}
		
		public String getEmailID() {
			return email;
			}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to my Address Book");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Name");
		String firstName = sc.next();
		
		System.out.println("Last Name");
		String lastName = sc.next();
		
		System.out.println("Address");
		String address = sc.next();
		
		System.out.println("Zip Code");
		String zip = sc.next();
		
		System.out.println("Phone Number");
		double phoneNumber = sc.nextDouble();
		
		System.out.println("Email ID");
		String email = sc.next();
		
		AddressBook members1 = new AddressBook();
		
		ArrayList<AddressBook>al = new ArrayList<AddressBook>();
		al.add(members1);
		
		Iterator<AddressBook> itr = al.iterator();
		
		while (itr.hasNext()) {
			AddressBook ab = (AddressBook) itr.next();
			System.out.println("\n............................................\n");
			System.out.println(ab.FirstName + "\n" + ab.LastName + "\n" + ab.Address +  
					  "\n" + ab.Zip + "\n" + ab.phoneNumber + "\n" + ab.email
					+ "\n");
		}

	}
}