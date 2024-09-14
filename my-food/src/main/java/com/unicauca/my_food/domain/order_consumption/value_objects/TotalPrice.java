package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.util.List;
import java.util.UUID;

import lombok.Getter;

@Getter
public class TotalPrice {
    private String id;
    private double totalPrice;

    public TotalPrice(){
        this.id = UUID.randomUUID().toString();
        this.totalPrice = 0;
    }

    public boolean calculateTotalPrice(List<Dish> dishes){
        if(dishes.isEmpty())
            return false;

        dishes.forEach(dish -> this.totalPrice = this.totalPrice + dish.getPrice());
        return true;
    }   

}
