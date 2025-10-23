package tech.ada.product_microservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.ada.product_microservice.model.Product;
import tech.ada.product_microservice.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> allProducts() {
        return this.productRepository.findAll();
    }

}
