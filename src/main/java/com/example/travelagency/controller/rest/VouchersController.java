package com.example.travelagency.controller.rest;

import com.example.travelagency.model.Vouchers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class VouchersController {

    private List<Vouchers> vouchers;


    @PostConstruct
    void init(){
       vouchers = new ArrayList<>(
                Arrays.asList(
                        new Vouchers(44 , 4053 , 23 , 643 , 5),
                        new Vouchers(824 , 34 , 4 , 32 , 4),
                        new Vouchers(434 , 8642 , 2 , 4324 , 6),
                        new Vouchers(4904 , 332 , 3 , 64 , 10),
                        new Vouchers(443 , 523 , 34 , 90 , 5)

                )
        );
    }

    @RequestMapping("/vouchers")
    List<Vouchers> getAll(){
        return vouchers;
    }
}
