package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import lombok.Getter;

@Getter
public class OrderDate {
    private String id;
    private LocalDate date;
    private LocalTime hour;

    public OrderDate(){
        this.id = UUID.randomUUID().toString();
        this.date = LocalDate.now();
        this.hour = LocalTime.now();
    }
}