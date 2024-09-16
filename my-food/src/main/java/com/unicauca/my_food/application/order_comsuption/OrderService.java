package com.unicauca.my_food.application.order_comsuption;

import org.springframework.stereotype.Service;

import com.unicauca.my_food.domain.order_consumption.service.OrderDomainService;
import com.unicauca.my_food.infrastucture.repositories.OrderRepository;

@Service
public class OrderService {
    private final OrderDomainService serviceDomain;
    private final OrderRepository repository;

    public OrderService(OrderDomainService serviceDomain, OrderRepository repository) {
        this.serviceDomain = serviceDomain;
        this.repository = repository;
    }

}
