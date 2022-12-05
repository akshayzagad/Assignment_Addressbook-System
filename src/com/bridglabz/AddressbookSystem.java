package com.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookSystem {
    Scanner sc = new Scanner(System.in);
    Contact contact=new Contact();
    ArrayList<Contact> contactsArrayList = new ArrayList<Contact>();
    public void addContact(){
        System.out.println("Enter the details of contact person");
        System.out.print("Enter first name:");
        contact.setFirstName(sc.next());
        System.out.print("Enter Last name:");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        System.out.println("Enter the ZipCode : ");
        contact.setZip(sc.next());
        System.out.println("Enter the Mobile no : ");
        contact.setPhoneNo(sc.next());;
        System.out.println("Enter the Email Id : ");
        contact.setEmail(sc.next());
    }
    public void displayContacts(){
        System.out.println(contact.toString());
    }
    }

