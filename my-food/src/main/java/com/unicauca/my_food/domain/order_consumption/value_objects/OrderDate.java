package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
    
    public String getOrderDate(){
        if(this.date == null || this.getDate() == null)
            return "error";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return this.getDate().format(dateFormatter);
    }   

    public String getOrderHour(){
        if(this.date == null || this.getHour() == null)
            return "error";

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); 
        return this.getDate().format(timeFormatter);
    }
}