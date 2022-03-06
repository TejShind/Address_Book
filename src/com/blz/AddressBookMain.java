package com.blz;

import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();

        System.out.println(" 1.Add Contact ");
        System.out.println(" 2.Edit Contact ");
        System.out.println(" 0.Exit ");
        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1 -> {
                    System.out.println("Enter number of contacts you want to add");
                    int contactsCount = scanner.nextInt();
                    for (int i = 0; i < contactsCount; i++) {
                        addressBook.addContacts();
                    }
                    for (int i = 0; i < contactsCount; i++) {
                        System.out.println(AddressBook.contacts.get(i));
                    }
                }
                case 2 -> {
                    System.out.println("Enter the first name you want to edit");
                    String check = scanner.next();
                    addressBook.editContact(check);
                }
            }
            System.out.println("1.Add Contact");
            System.out.println("2.Edit Contact");
            System.out.println("0.Exit");
            option = scanner.nextInt();
        }
    }
}