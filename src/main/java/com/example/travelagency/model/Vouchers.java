package com.example.travelagency.model;

import lombok.Data;

@Data
public class Vouchers {

    private Integer routecode;
    private Integer customercode;
    private Integer dateofdeparture;
    private Integer number;
    private Integer discount;

    public Vouchers(Integer routecode, Integer customercode, Integer dateofdeparture, Integer number, Integer discount) {
        this.routecode = routecode;
        this.customercode = customercode;
        this.dateofdeparture = dateofdeparture;
        this.number = number;
        this.discount = discount;
    }
}
