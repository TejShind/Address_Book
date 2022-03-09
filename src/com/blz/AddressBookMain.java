package com.blz;
import java.util.*;
public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();
        System.out.println(" 1.Add Contact ");
        System.out.println(" 2.Edit Contact ");
        System.out.println(" 3.Delete Contact ");
        System.out.println(" 0.Exit ");
        int operation = scanner.nextInt();
        while (operation != 0) {
            switch (operation) {
                case 1:
                    System.out.println("Enter number of contacts you want to add");
                    int contactsCount = scanner.nextInt();
                    for (int i = 0; i < contactsCount; i++) {
                        addressBook.addContacts();
                    }
                    for (int i = 0; i < contactsCount; i++) {
                        System.out.println(AddressBook.contacts.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter the first name you want to edit");
                    String firstName = scanner.next();
                    addressBook.editContact(firstName);
                    break;
                case 3:
                    System.out.println("Enter the first name you want to delete");
                    String FirstName = scanner.next();
                    addressBook.deleteContact(FirstName);
            }
            operation = scanner.nextInt();

            System.out.println(" 1.Add Contact ");
            System.out.println(" 2.Edit Contact ");
            System.out.println(" 3.Delete Contact ");
            System.out.println(" 0.Exit ");
        }
    }
}

