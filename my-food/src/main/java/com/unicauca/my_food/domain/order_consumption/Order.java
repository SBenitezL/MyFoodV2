package com.unicauca.my_food.domain.order_consumption;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.unicauca.my_food.domain.order_consumption.value_objects.Dish;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderDate;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderState;
import com.unicauca.my_food.domain.order_consumption.value_objects.TotalPrice;

import lombok.Getter;

@Getter
public class Order {
    private String id;
    private OrderDate date;
    private OrderState state;
    private List<Dish> dishes;
    private TotalPrice totalPrice;    

    public Order(){
        this.id = UUID.randomUUID().toString();
        this.date = new OrderDate();
        this.state = new OrderState(0);
        this.dishes = new ArrayList<>();
        this.totalPrice = new TotalPrice();
    }

    public boolean changeState(int state){
        this.state = new OrderState(state);
        return true;
    }

    public boolean addDish(Dish dish){
        if(this.dishes == null)
            return false;

        this.dishes.add(dish);
        return true;
    }

    public boolean removeDish(String id){
        if(this.dishes == null)
            return false;

        for(int i = 0 ; i < this.dishes.size() ; i++){
            if(this.dishes.get(i).getId().equals(id)){
                this.dishes.remove(i);
                return true;
            }
        }

        return false;
    }

}
