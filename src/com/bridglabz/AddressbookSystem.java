package com.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookSystem {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    ArrayList<Contact> contactsArrayList = new ArrayList<Contact>();

    public void addContact() {
        System.out.println("Enter the details of contact person");
        System.out.print("Enter first name:");
        contact.setFirstName(sc.next());
        String firstName = contact.getFirstName();
        System.out.print("Enter Last name:");
        contact.setLastName(sc.next());
        String lastName = contact.getLastName();
        System.out.println("Enter the Address : ");
        contact.setAddress(sc.next());
        String address = contact.getAddress();
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        String city = contact.getCity();
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        String state = contact.getState();
        System.out.println("Enter the ZipCode : ");
        contact.setZip(sc.next());
        String zipCode = contact.getZip();
        System.out.println("Enter the Mobile no : ");
        contact.setPhoneNo(sc.next());
        String phoneNo = contact.getPhoneNo();
        System.out.println("Enter the Email Id : ");
        contact.setEmail(sc.next());
        String email = contact.getEmail();
        Contact contact = new Contact(firstName, lastName, address, city, zipCode, state, phoneNo, email);
        contactsArrayList.add(contact);
    }

    public void displayContacts() {
        for (int i = 0; i < contactsArrayList.size(); i++) {
            Contact contact=contactsArrayList.get(i);
            System.out.println(contact.toString());
        }
    }
    public void editContacts() {
        // editing the existing contact using their First Name
        System.out.println("Enter the First Name of Contact to Edit");
        String firstName = sc.next();
        boolean isAvailable = false ;
        for(Contact contact : contactsArrayList) {
            if(contact.getFirstName().equals(firstName)) {
                isAvailable = true ;
                System.out.println("What you want to edit for the contact");
                System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Mobile Number\n8.Email id");
                int choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Enter the First Name :");
                        contact.setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter the Last Name :");
                        contact.setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter the Address :");
                        contact.setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter the City :");
                        contact.setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter the State :");
                        contact.setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter the Zip code :");
                        contact.setZip(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter the Mobile Number :");
                        contact.setPhoneNo(sc.next());
                        break;
                    case 8:
                        System.out.println("Enter the Email id :");
                        contact.setEmail(sc.next());
                        break;
                }
                System.out.println("Updated Sucessfully ...");
            }
        }
        if(isAvailable == false){
            System.out.println("Contact is not Available \nTry again");
        }
    }
    public void deleteContact(){
        System.out.println("Enter First Name Which You Have To Delete");
        String firstName=sc.next();
        boolean isAvailable=true;
        for (int i=0;i<contactsArrayList.size();i++){
            if (contactsArrayList.get(i).getFirstName().equals(firstName)){
                contactsArrayList.remove(i);
                System.out.println("Contact Deleted Successfully...!");
                break;
            }
            else{
                System.out.println("Contact is not Available \nTry again");
            }
        }
    }
}
