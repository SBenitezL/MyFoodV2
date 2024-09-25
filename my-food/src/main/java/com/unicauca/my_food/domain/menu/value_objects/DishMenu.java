package com.unicauca.my_food.domain.menu.value_objects;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.UUID;

import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNotFoundException;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNullException;

import java.util.ArrayList;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DishMenu {
    private String id; 
    private String name; 
    private List<IngredientDish> ingredients;
    private double price;

    public DishMenu(String name, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public boolean addIngredient(IngredientDish ingredient) {
        if (this.ingredients == null) {
            throw new ObjectNullException("Ingredients list is null...");
        }

        if (ingredient == null) {
            throw new ObjectNullException("Ingredient is null...");
        }

        this.ingredients.add(ingredient);
        return true;
    }

    public boolean removeIngredient(String id) {
    if (this.ingredients == null) {
        throw new ObjectNullException("Ingredients list is null...");
    }

    if (id == null || id.isBlank()) {
        throw new ObjectNullException("Ingredient's id is null or blank...");
    }

    for (int i = 0; i < this.ingredients.size(); i++) {
        if (this.ingredients.get(i).getId().equals(id)) {
            this.ingredients.remove(i);
            return true;
        }
    }
    throw new ObjectNotFoundException("Ingredient with id: " + id + " was not found...");
}


}
