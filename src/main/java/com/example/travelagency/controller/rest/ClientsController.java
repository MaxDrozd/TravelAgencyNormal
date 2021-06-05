package com.example.travelagency.controller.rest;

import com.example.travelagency.model.Client;
import com.example.travelagency.services.client.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class ClientsController {

    @Autowired
    ClientsService service;

    @RequestMapping
    List<Client> getAll() {
        return service.getAll();
    }
    @PostMapping
    Client create(Client clients) {
        return null;
    }
    @GetMapping("/{code}")
    Client get(String code) {
        return null;
    }
    @PutMapping
    Client update(Client clients) {
        return null;
    }
    @DeleteMapping
    Client delate(String name){

        return null;
    }
}

