package com.unicauca.my_food.domain.menu.service;

import com.unicauca.my_food.domain.menu.Menu;
import com.unicauca.my_food.domain.menu.value_objects.DishMenu;
import com.unicauca.my_food.domain.menu.value_objects.IngredientDish;

public interface IMenuDomainService {
    public boolean addDish(Menu menu, DishMenu dish);
    public boolean removeDish(Menu menu, String idDish);
    public String getDateMenu(Menu menu);
    public boolean addIngredient(DishMenu dish, IngredientDish ingredient);
    public boolean removeIngredient(DishMenu dish, String idIngredient);   
}
