package com.example.travelagency.model;

import lombok.Data;

@Data
public class Routes {

    private Integer routecode;
    private String country;
    private String climate;
    private String duration;
    private Integer hotel;
    private Integer cost;

    public Routes(Integer routecode, String country, String climate, String duration, Integer hotel, Integer cost) {
        this.routecode = routecode;
        this.country = country;
        this.climate = climate;
        this.duration = duration;
        this.hotel = hotel;
        this.cost = cost;
    }
}

