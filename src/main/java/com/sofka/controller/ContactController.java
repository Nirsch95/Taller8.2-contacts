package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Slf4j
@RestController
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(path = "/users")
    public List<Contact> listado(){

        var contacts = contactService.list();
        return contacts;
    }

    @PostMapping(path = "/user")
    public ResponseEntity<Contact> save(@RequestBody Contact contact){
        log.info("Contact to create: {}", contact);
        contactService.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/user/{id}")
    public ResponseEntity<Contact> delete(Contact contact){
        log.info("Contact to delete: {}", contact);
        contactService.delete(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}
