package core.product;

import com.example.execerciciosSpringBoot.core.domain.product.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {

    @Test
    void createProduct(){
        Product productTest = new Product("Produto Teste 1", 10, "Produto Teste para testar");


        assertEquals(productTest.getName(),"Produto Teste 1");
        assertEquals(productTest.getPrice(),10);
        assertEquals(productTest.getDescription(), "Produto Teste para testar");
    }
}
