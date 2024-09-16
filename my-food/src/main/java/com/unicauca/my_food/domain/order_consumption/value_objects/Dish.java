package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dish {
    private String id;
    private String name;
    private List<Ingredient> ingredients;
    private double price;

    public Dish(String name, double price ){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public boolean addIngredient(Ingredient ingredient){
        if(this.ingredients == null)
            return false;

        this.ingredients.add(ingredient);
        return true;
    }

    public boolean removeIngredient(String id){
        if(this.ingredients == null)
            return false;

        for(int i = 0 ; i < this.ingredients.size() ; i++){
            if(this.ingredients.get(i).getId().equals(id)){
                this.ingredients.remove(i);
                return true;
            }
        }

        return false;
    }
}
