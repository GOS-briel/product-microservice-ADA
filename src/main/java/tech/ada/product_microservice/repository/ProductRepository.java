package tech.ada.product_microservice.repository;

import org.springframework.stereotype.Component;
import tech.ada.product_microservice.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
        this.products.add(new Product(100L, "Tv Samsung 100`"));
    }

    public List<Product> findAll() {
        return this.products;
    }
}
