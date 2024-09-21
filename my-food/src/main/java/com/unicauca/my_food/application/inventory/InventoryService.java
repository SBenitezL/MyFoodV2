package com.unicauca.my_food.application.inventory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.inventory.service.ProductDomainService;
import com.unicauca.my_food.infrastucture.repositories.InventoryRepository;

@Service
public class InventoryService implements IInventoryService {

    private final ProductDomainService serviceDomain;

    private final InventoryRepository repository;

    public InventoryService(ProductDomainService serviceDomain, InventoryRepository repository) {
        this.serviceDomain = serviceDomain;
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return this.repository.save(product);
    }

    @Override
    public Product delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public List<Product> productsExpired() {
        return this.repository.expired();
    }

    @Override
    public Product update(Product product) {
        return this.update(product);
    }

    @Override
    public Product increase(String id, int amount) {
        Product product = this.repository.findById(id);
        this.serviceDomain.increaseStock(product, amount);
        return product;
    }

    @Override
    public Product decrease(String id, int amount) {
        Product product = this.repository.findById(id);
        this.serviceDomain.decreaseStock(product, amount);
        return product;
    }

    @Override
    public void markExpired() {
        List<Product> data = this.repository.findAll();
        for (Product value : data)
            this.serviceDomain.markExpired(value);
    }

}
