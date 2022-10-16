package com.example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneExample {

    public static void main(String[] args) {

        Phone samsung = new Phone(900, "Samsung", true);
        samsung.setSupportedOsVersions(new String[]{"12", "13"});

        Phone iPhone = new Phone("iPhone", false);
        iPhone.setNotSupportedOsVersions(List.of("14", "15", "16"));

        System.out.println("\nDefault price: " + iPhone.getPrice());
        iPhone.setPrice(1000);
        System.out.println("New price: " + iPhone.getPrice());

        System.out.println("\nOld name: " + samsung.getName());
        samsung.setName("New Samsung");
        System.out.println("New name: " + samsung.getName());

        System.out.println("\nNot Android: " + iPhone.isAndroid());
        iPhone.setAndroid(true);
        System.out.println("Set to Android: " + iPhone.isAndroid());

        System.out.println("\nSamsung supported OS count: " + samsung.supportedOsVersions.length);
        for (int i = 0; i < samsung.supportedOsVersions.length; i++) {
            System.out.println("OS version: " + samsung.supportedOsVersions[i]);
        }

        System.out.println("\niPhone not supported OS count: " + iPhone.notSupportedOsVersions.size());
        for (String osVersion : iPhone.notSupportedOsVersions) {
            System.out.println("OS version: " + osVersion);
        }

        iPhone.setAddressBook(Map.of(
                "Dima", new Contact("8-800-x", "8-495-x"),
                "Vasya", new Contact("8-800-x")
        ));

        Set<String> keySet = iPhone.addressBook.keySet();
        Collection<Contact> values = iPhone.addressBook.values();
        Set<Map.Entry<String, Contact>> entries = iPhone.addressBook.entrySet();
        System.out.println();
        for (Map.Entry<String, Contact> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
