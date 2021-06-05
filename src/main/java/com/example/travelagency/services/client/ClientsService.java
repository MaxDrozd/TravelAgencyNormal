package com.example.travelagency.services.client;

import com.example.travelagency.model.Client;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientsService {
    private List<Client> clients;

    @PostConstruct
    void init(){
        clients = new ArrayList<>(
                Arrays.asList(
                        new Client(2 , "Malva" , "GG" , "las" ,  "backer-street" , "0448475992"),
                        new Client(4 , "Kykak" , "FF" , "lor" ,  "backer-street" , "0669223550"),
                        new Client(8 , "Damal" , "RR" , "vor" ,  "backer-street" , "0992256197"),
                        new Client(1 , "Lilov" , "SS" , "zak" ,  "backer-street" , "0556783743"),
                        new Client(3 , "Kamar" , "BB" , "pop" ,  "backer-street" , "0462646728")

                )
        );
    }

    public List<Client> getAll() {

        return clients;
    }

    public void delete(Integer code) {
        Client client = new Client();
       clients = clients.stream().filter(element->element.getCode() != code)
               .collect(Collectors.toList());
    }
}