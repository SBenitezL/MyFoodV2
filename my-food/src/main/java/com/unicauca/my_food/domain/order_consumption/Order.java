package com.unicauca.my_food.domain.order_consumption;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.unicauca.my_food.domain.order_consumption.value_objects.Dish;
import com.unicauca.my_food.domain.order_consumption.value_objects.Ingredient;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderDate;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderState;
import com.unicauca.my_food.domain.order_consumption.value_objects.TotalPrice;

import lombok.Getter;

@Getter
public class Order {
    private final int MAX_STATE_AVAIBLE = 2;

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
        if(state > MAX_STATE_AVAIBLE)
            return false;
        
        this.state = new OrderState(state);
        return true;
    }

    public boolean addDish(Dish dish){
        if(this.dishes == null)
            return false;

        this.dishes.add(dish);
        return true;
    }

    public boolean addIngredient(String idDish ,Ingredient ingredient){
        if(this.dishes == null)
            return false;
        
        for(int i = 0 ; i < this.dishes.size() ; i++){
            if(this.dishes.get(i).getId().equals(idDish)){
                this.dishes.get(i).addIngredient(ingredient);
                return true;
            }
        }

        return false;
    }

    public boolean removeIngredient(String idDish ,String idIngredient){
        if(this.dishes == null)
            return false;
        
        int pos = 0;

        for(int i = 0 ; i < this.dishes.size() ; i++){
            if(this.dishes.get(i).getId().equals(idDish)){
                pos = i;
                break;
            }
        }

        return this.dishes.get(pos).removeIngredient(idIngredient);
    }

    public String getOrderDate(){
        if(this.date == null || this.date.getDate() == null)
            return "error";

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return this.date.getDate().format(dateFormatter);
    }   

    public String getOrderHour(){
        if(this.date == null || this.date.getHour() == null)
            return "error";

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); 
            return this.date.getDate().format(timeFormatter);
    }

}
