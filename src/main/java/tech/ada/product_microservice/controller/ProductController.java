package tech.ada.product_microservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tech.ada.product_microservice.model.Product;
import tech.ada.product_microservice.service.ProductService;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> allProducts() {
        return ResponseEntity.ok(this.productService.allProducts());
    }

    //GET BY ID
    @GetMapping("/{sku}")
    public ResponseEntity<Product> getProduct(@PathVariable Long sku) {
        return ResponseEntity.ok(this.productService.getProductBySku(sku));
    }

    //POST - CREATE
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.create(product));
    }

    //PUT - UPDATE ALL
    @PutMapping("/{sku}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long sku,
                                                 @RequestBody Product product) {
        return ResponseEntity.ok(this.productService.updateProduct(sku, product));
    }

    //PATCH - PARTIAL UPDATE
    @PatchMapping("/{sku}")
    public ResponseEntity<Product> partialUpdate(@PathVariable Long sku,
                                                 @RequestBody Product product) {
        return ResponseEntity.ok(this.productService.partialUpdate(sku, product));
    }

    //DELETE - REMOVE
    @DeleteMapping("/{sku}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long sku) {
        this.productService.deleteProduct(sku);
        return ResponseEntity.noContent().build();
    }

}
