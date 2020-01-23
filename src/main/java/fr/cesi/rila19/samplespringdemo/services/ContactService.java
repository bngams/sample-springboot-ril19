package fr.cesi.rila19.samplespringdemo.services;

import fr.cesi.rila19.samplespringdemo.entities.Contact;
import fr.cesi.rila19.samplespringdemo.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    ContactRepository contactRepo;

    @Autowired
    ContactService(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    public List<Contact> getContacts() {
        return (List<Contact>) this.contactRepo.findAll();
    }

    public Contact findContactById(Long id) {
        return this.contactRepo.findById(id).get();
    }

    public Contact saveContact(Contact c) {
        return this.contactRepo.save(c);
    }
}
