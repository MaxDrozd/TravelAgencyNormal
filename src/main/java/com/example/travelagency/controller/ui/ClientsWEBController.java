package com.example.travelagency.controller.ui;

import com.example.travelagency.services.client.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/ui/rooms")
public class ClientsWEBController{

    @Autowired
    ClientsService service;

    @RequestMapping("/clients")
    String getAll(Model model){
        System.out.println("hello       ");
        model.addAttribute("clients" , service.getAll());
        return "clients";}

        @RequestMapping("/delete/{code}")
                String delete(Model model, @PathVariable("code") Integer code){
            ;
        service.delete(code);
            model.addAttribute("clients" , service.getAll());
        return "clients";
        }
    }


