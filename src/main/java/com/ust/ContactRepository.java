package com.ust;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactRepository {

    private List<Contact> contacts = new LinkedList();
        long id=0;
    private long generateId() {
        return id++;

    }

    public Contact save(Contact contact) {
        contacts.add(contact);
        return contact;
    }

    public List<Contact> findById(long id) throws ContactNotFoundException {
        // TODO
        List<Contact> collect = contacts.stream()
                .filter(contact -> contact.getId()==(id))
                .collect(Collectors.toList());
        return collect;
    }

    public List<Contact> findByPhoneNumber(String phoneNumber) throws ContactNotFoundException {
        // TODO

        List<Contact> collect = contacts.stream()
                .filter(contact -> contact.getPhoneNumbers().contains(phoneNumber))
                .collect(Collectors.toList());
        return collect;
    }

    public List<Contact> findByName(String name) throws ContactNotFoundException {
        // TODO

        List<Contact> collect = contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .collect(Collectors.toList());
        return collect;
    }

}
