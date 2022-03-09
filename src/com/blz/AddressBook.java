package com.blz;

import java.util.*;

import static java.lang.System.in;

public class AddressBook {

    public static List<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(in);

    //Compute for ADD contacts.
    public void addContacts() {
        System.out.println("Enter the contact details");
        Contact contact = new Contact();

        System.out.println("Enter the first name");
        contact.setFirstName(scanner.next());

        System.out.println("Enter the last name");
        contact.setLastName(scanner.next());

        System.out.println("Enter the address");
        contact.setAddress(scanner.next());

        System.out.println("Enter the city name");
        contact.setCity(scanner.next());

        System.out.println("Enter the state name");
        contact.setCity(scanner.next());

        System.out.println("Enter the zip code");
        contact.setZip(scanner.nextInt());

        System.out.println("Enter the phone number");
        contact.setPhoneNo(scanner.nextInt());

        System.out.println("Enter the email");
        contact.setEmail(scanner.next());

        contacts.add(contact);
    }

    //Compute for Edit contacts.
    public void editContact(String firstName) {
        System.out.println(AddressBook.contacts);
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = (Contact) contacts.get(i);
            System.out.println(contact);
            if (contact.getFirstName().equals(firstName)) {
                System.out.println("What data you want to edit?");
                System.out.println("1.Edit First name");
                System.out.println("2.Edit Last name ");
                System.out.println("3.Edit Address");
                System.out.println("4.Edit Phone number");
                System.out.println("5.Edit City name");
                System.out.println("6.Edit Zip number");
                System.out.println("7.Edit Email address");


                switch (scanner.nextInt()) {
                    case 1:
                        contact.setFirstName(scanner.next());
                        break;
                    case 2:
                        contact.setLastName(scanner.next());
                        break;
                    case 3:
                        contact.setAddress(scanner.next());
                        break;
                    case 4:
                        contact.setPhoneNo(scanner.nextInt());
                        break;
                    case 5:
                        contact.setCity(scanner.next());
                        break;
                    case 6:
                        contact.setZip(scanner.nextInt());
                        break;
                    case 7:
                        contact.setEmail(scanner.next());
                        break;

                }
            }
            System.out.println(AddressBook.contacts);
        }
    }

    //Compute for Delete contacts.
    public void deleteContact(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                contacts.remove(contact);
            }
            System.out.println(AddressBook.contacts);
            break;
        }
    }
}