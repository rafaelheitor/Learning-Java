package com.example.execerciciosSpringBoot.infrastructure.adapter.product;

import com.example.execerciciosSpringBoot.core.domain.product.entity.Product;
import com.example.execerciciosSpringBoot.core.domain.product.port.ProductRepositoryPort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryAdapterTest {
    private final ProductRepositoryPort productRepository = ProductRepositoryAdapter.getInstance();


    @Test
    void saveProduct(){
        Product productTest = new Product(1L, "Product Test", 10, "Description of Product Test");
        Product productResult = productRepository.save(productTest);
        assertEquals(productResult, productTest);
    }

    @Test
    void getProduct(){
        Product productResult = productRepository.getOne(1L);
        assertNotNull(productResult);
    }

    @Test
    void deleteProduct(){
        Product productTest = new Product(2L, "Product Test", 10, "Description of Product Test");
        productRepository.save(productTest);
        productRepository.delete(productTest.getId());
        Product productResult = productRepository.getOne(productTest.getId());
        assertNull(productResult);
    }
}