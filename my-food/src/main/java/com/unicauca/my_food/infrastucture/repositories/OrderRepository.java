package com.unicauca.my_food.infrastucture.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.unicauca.my_food.domain.order_consumption.Order;

@Repository
public class OrderRepository {
    private final HashMap<String, Order> db;

    public OrderRepository(){
        this.db = new HashMap<>();
    }

    public List<Order> findAll(){
        return new ArrayList<>(db.values());
    }

    public Order findById(String orderId){
        if(!this.db.containsKey(orderId))
            return null;

        return this.db.get(orderId);
    }

    public boolean save(Order order){
        if(this.db.containsKey(order.getId()))
            return false;

        this.db.put(order.getId(), order);
        return true;
    }

    public boolean update(String oldOrderId, Order newOrder){
        if(this.db.containsKey(oldOrderId))
            return false;

        this.db.remove(oldOrderId);
        return this.save(newOrder);
    }

    public boolean delete(String orderId){
        if(!this.db.containsKey(orderId))
            return false;
        
        this.db.remove(orderId);
        return true;
    }

    
}
