package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Phone {

    int price;
    String name;
    boolean isAndroid;
    String[] supportedOsVersions;
    List<String> notSupportedOsVersions;
    Set<String> uniqueUnsortedVersions;
    Map<String, Contact> addressBook;

    public Phone(int price, String name, boolean isAndroid) {
        this.price = price;
        this.name = name;
        this.isAndroid = isAndroid;
    }

    public Phone(String name, boolean isAndroid) {
        this.name = name;
        this.isAndroid = isAndroid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public String[] getSupportedOsVersions() {
        return supportedOsVersions;
    }

    public void setSupportedOsVersions(String[] supportedOsVersions) {
        this.supportedOsVersions = supportedOsVersions;
    }

    public List<String> getNotSupportedOsVersions() {
        return notSupportedOsVersions;
    }

    public void setNotSupportedOsVersions(List<String> notSupportedOsVersions) {
        this.notSupportedOsVersions = notSupportedOsVersions;
    }

    public Set<String> getUniqueUnsortedVersions() {
        return uniqueUnsortedVersions;
    }

    public void setUniqueUnsortedVersions(Set<String> uniqueUnsortedVersions) {
        this.uniqueUnsortedVersions = uniqueUnsortedVersions;
    }

    public Map<String, Contact> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(Map<String, Contact> addressBook) {
        this.addressBook = addressBook;
    }
}
