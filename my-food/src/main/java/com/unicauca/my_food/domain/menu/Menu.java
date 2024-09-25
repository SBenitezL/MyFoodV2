package com.unicauca.my_food.domain.menu;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import com.unicauca.my_food.domain.menu.value_objects.DateMenu;
import com.unicauca.my_food.domain.menu.value_objects.DishMenu;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNotFoundException;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNullException;

import lombok.Getter;

@Getter
public class Menu {
    private String id;
    private List<DishMenu> dishes;
    private DateMenu date;

    public Menu(){
        this.id =  UUID.randomUUID().toString();
        this.date = new DateMenu();
        this.dishes = new ArrayList<>(); 
    }
    public Menu(String id, List<DishMenu> dishes, DateMenu date) {
        this.id = id;
        this.dishes = dishes;
        this.date = date;
    }

    public boolean addDish(DishMenu dish) {
        if (this.dishes == null) 
            throw new ObjectNullException("Dish list is null...");
        if (dish == null) 
            throw new ObjectNullException("Dish is null...");
        return this.dishes.add(dish);
    }

    public boolean removeDish(String id) {
        if (this.dishes == null) 
            throw new ObjectNullException("Dish list is null...");
        if (id.isBlank()) 
            throw new ObjectNullException("Dish ID is null...");
        for (int i = 0; i < this.dishes.size(); i++) {
            DishMenu dish = this.dishes.get(i);
            if (dish.getId().equals(id)) {
                this.dishes.remove(i);
                return true;
            }
        }
        throw new ObjectNotFoundException("Dish not found...");
    }

}








