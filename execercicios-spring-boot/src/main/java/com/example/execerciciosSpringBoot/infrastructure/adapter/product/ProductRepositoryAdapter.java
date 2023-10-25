package com.example.execerciciosSpringBoot.infrastructure.adapter.product;

import com.example.execerciciosSpringBoot.core.domain.product.entity.Product;
import com.example.execerciciosSpringBoot.core.domain.product.port.ProductRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {
    private List<Product> products = new ArrayList<Product>();
    private static ProductRepositoryAdapter instance;

    ProductRepositoryAdapter () {
    }

    public static ProductRepositoryAdapter getInstance() {
        if(instance == null){
            instance = new ProductRepositoryAdapter();
        }
        return instance;
    }

    @Override
    public Product save(Product object) {
        this.products.add(object);
        return object;
    }

    @Override
    public Product edit(Long id, Product object) {
        return null;
    }

    @Override
    public Product getOne(Long id) {
        for(Product product: products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Predicate<Product> filterCondition = product -> !product.getId().equals(id);
        this.products = this.products.stream().filter(filterCondition).collect(Collectors.toList());
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }
}
