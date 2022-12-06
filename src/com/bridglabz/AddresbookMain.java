package com.bridglabz;

import java.util.Scanner;

public class AddresbookMain {
    public static void main(String[] args) {
        AddressbookSystem addressBook = new AddressbookSystem();
        System.out.println("WelCome To AddressBook Program");
        Scanner scanner = new Scanner(System.in);
        int opration;
        do {
            System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT DETAILS \n4.EXIT ");
            System.out.println("Enter the Operation Number");
            opration = scanner.nextInt();
            switch (opration) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContacts();
                case 3:
                    addressBook.editContacts();
                default:
                    System.out.println("Enter The Wrong Opration Number");
            }
        } while (opration != 4);
    }
}
