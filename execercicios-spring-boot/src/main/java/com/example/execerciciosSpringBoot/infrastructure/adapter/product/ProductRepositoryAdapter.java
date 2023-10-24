package com.example.execerciciosSpringBoot.infrastructure.adapter.product;

import com.example.execerciciosSpringBoot.core.domain.product.entity.Product;
import com.example.execerciciosSpringBoot.core.domain.product.port.ProductRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {
    @Override
    public Product save(Product object) {
        return null;
    }

    @Override
    public Product edit(Long id, Product object) {
        return null;
    }

    @Override
    public Product getOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
