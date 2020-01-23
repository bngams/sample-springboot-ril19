package fr.cesi.rila19.samplespringdemo.controllers.api;

import fr.cesi.rila19.samplespringdemo.entities.Contact;
import fr.cesi.rila19.samplespringdemo.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Controller + ResponseBody
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;

    @Autowired
    ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // GET /contacts
    @RequestMapping("")
    public List<Contact> getContacts() {
        return this.contactService.getContacts();
    }

    // GET /contacts/1 - /contacts/id
    // we use a path variable not an url param
    // /contacts?id=1 <= param
    @RequestMapping("/{id}")
    public Contact getContactById(@PathVariable Long id) {
        return null;
    }

    // POST /contacts
    // @RequestMapping(value="/contacts", method = "POST")
    @PostMapping("")
    public ResponseEntity<Contact> postContact(@RequestBody Contact c) {
        return new ResponseEntity<Contact>(this.contactService.saveContact(c), HttpStatus.CREATED);
    }

    // PUT /contacts
    @PutMapping("")
    public Contact putContact(@RequestBody Contact c) {
        return null;
    }

    // DELETE /contacts
    @DeleteMapping("/{id}")
    public Long deleteContactById(@PathVariable Long id) {
        return null;
    }

}
