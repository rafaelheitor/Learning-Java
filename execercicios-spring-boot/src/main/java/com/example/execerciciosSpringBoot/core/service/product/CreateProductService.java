package com.example.execerciciosSpringBoot.core.service.product;

import com.example.execerciciosSpringBoot.core.domain.product.entity.dto.ProductUsecaseDTO;
import com.example.execerciciosSpringBoot.core.domain.product.port.ProductRepositoryPort;
import com.example.execerciciosSpringBoot.core.domain.product.usecase.CreateProductUsecase;
import com.example.execerciciosSpringBoot.core.domain.product.usecase.port.CreateProductPort;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateProductService implements CreateProductUsecase {
    @Autowired
    private ProductRepositoryPort productRepository;

    public void execute() {
        System.out.println(productRepository.getClass());
    }
}
