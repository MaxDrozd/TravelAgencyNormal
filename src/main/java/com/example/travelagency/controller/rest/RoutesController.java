package com.example.travelagency.controller.rest;

import com.example.travelagency.model.Routes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RoutesController {

    private List<Routes> routes;


    @PostConstruct
    void init(){
        routes = new ArrayList<>(
                Arrays.asList(
                        new Routes(6483 , "Italy" , "moderate" , "23days" , 23 , 55),
                        new Routes(3124 , "Italy" , "moderate" , "23days" , 76 , 53),
                        new Routes(6583 , "Italy" , "moderate" , "23days" , 89 , 98),
                        new Routes(9443 , "Italy" , "moderate" , "23days" , 21 , 69),
                        new Routes(7063 , "Italy" , "moderate" , "23days" , 12 , 51)

                )
        );
    }

    @RequestMapping("/routes")
    List<Routes> getAll(){
        return routes;
    }
}
