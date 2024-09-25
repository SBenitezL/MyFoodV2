package com.unicauca.my_food.application.menu;

import java.util.List;

import com.unicauca.my_food.domain.menu.Menu;
import com.unicauca.my_food.domain.menu.value_objects.DishMenu;

public interface IMenuService {

    public List<Menu> getMenus();
    public Menu getMenu(String idMenu);
    public Menu createMenu();
    public Menu removeMenu(String idMenu);
    public Menu updateMenu(String idMenu, Menu newMenu);
    public Menu addDish(String idMenu, String dishName, double dishValue);
    public Menu addIngredient(String idMenu, String dishId, List<String> ingredientNames);
    public Menu removeIngredient(String idMenu, String dishId, String ingredientId);
    public Menu removeDish(String idMenu, String idDish);
    public String getOrderDate(String idMenu);
    public List<DishMenu> getDishesOrder(String idMenu);
   
}
