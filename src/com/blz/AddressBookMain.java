package com.blz;

import java.util.*;

import static com.blz.AddressBook.*;

public class AddressBookMain {

    public static AddressBook addressBook = new AddressBook();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter 0 to quit the AddressBook system ");
            System.out.println("Enter 1 to add New contacts");
            System.out.println("Enter 2 to edit existing contact");
            System.out.println("Enter 3 to edit delete existing contact");
            System.out.println("Enter 4 to Add Multiple Contacts");
            int operation = scanner.nextInt();
            while (operation != 0) {
                switch (operation) {
                    case 0:
                        System.out.println("exiting from Address book");
                        quit = true;
                        break;
                    case 1:
                       addressBook.addContacts();
                        break;
                    case 2:
                        addressBook.editContact();
                    case 3:
                        addressBook.deleteContact();
                    case 4:
                        addressBook.addMultipleContact();
                    default:
                        System.out.println("Invalid entry");

                }
            }
        }
    }
}