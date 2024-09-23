package com.unicauca.my_food.domain.menu.service;

import com.unicauca.my_food.domain.menu.Menu;
import com.unicauca.my_food.domain.menu.value_objects.DishMenu;
import com.unicauca.my_food.domain.menu.value_objects.IngredientDish;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNullException;



public class MenuDomainService implements IMenuDomainService {

    @Override
    public boolean addDish(Menu menu, DishMenu dish) {
        if(menu == null)
            throw new ObjectNullException("Menu is null...");

        if(dish == null)
            throw new ObjectNullException("Dish is null...");
        
        return menu.addDish(dish);
    }

    @Override
    public boolean removeDish(Menu menu, String idDish) {
        if(menu == null)
            throw new ObjectNullException("Menu is null...");

        if(idDish.isBlank())
            throw new ObjectNullException("Dish's id is null...");
        
        return menu.removeDish(idDish);
    }

    @Override
    public String getDateMenu(Menu menu) {
        if(menu == null)
            throw new ObjectNullException("Menu is null...");

        return menu.getDate().getDate();
    }

    @Override
    public boolean addIngredient(DishMenu dish, IngredientDish ingredient) {
        if(dish == null)
            throw new ObjectNullException("Dish is null...");
        
        if(ingredient == null)
            throw new ObjectNullException("Ingredient is null...");
        
        return dish.addIngredient(ingredient);
    }

    @Override
    public boolean removeIngredient(DishMenu dish, String idIngredient) {
        if(dish == null)
        throw new ObjectNullException("Dish is null...");
    
    if(idIngredient.isBlank())
        throw new ObjectNullException("Ingredient's id is null...");
    
    return dish.removeIngredient(idIngredient);
    }

    
   
}
