package com.example.execerciciosSpringBoot.core.service.product;

import com.example.execerciciosSpringBoot.core.domain.product.usecase.CreateProductUsecase;
import com.example.execerciciosSpringBoot.core.domain.product.usecase.port.CreateProductPort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateProductServiceTest {

    @Test
    void test(){
        CreateProductService usecase = new CreateProductService();
        usecase.execute();
    }
}