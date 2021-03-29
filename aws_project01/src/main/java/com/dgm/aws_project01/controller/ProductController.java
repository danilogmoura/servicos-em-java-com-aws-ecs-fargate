package com.dgm.aws_project01.controller;

import com.dgm.aws_project01.model.Product;
import com.dgm.aws_project01.repository.ProductRepository;
import com.dgm.aws_project01.service.ProductPublisher;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.dgm.aws_project01.enums.EventType.*;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    private final ProductRepository productRepository;

    private final ProductPublisher productPublisher;

    @Autowired
    public ProductController(ProductRepository productRepository, ProductPublisher productPublisher) {
        this.productRepository = productRepository;
        this.productPublisher = productPublisher;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product productCreated = productRepository.save(product);

        productPublisher.publishProductEvent(productCreated,
                PRODUCT_CREATED,
                Faker.instance().name().username());

        return ResponseEntity.status(CREATED).body(productCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable Long id) {
        if (productRepository.existsById(id)) {
            product.setId(id);

            Product productUpdated = productRepository.save(product);

            productPublisher.publishProductEvent(productUpdated,
                    PRODUCT_UPDATE,
                    Faker.instance().name().username());

            return ResponseEntity.ok(productUpdated);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        Optional<Product> optProduct = productRepository.findById(id);

        if (optProduct.isPresent()) {
            Product product = optProduct.get();
            productRepository.delete(product);

            productPublisher.publishProductEvent(product,
                    PRODUCT_DELETED,
                    Faker.instance().name().username());

            return ResponseEntity.ok(product);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping(path = "/bycode")
    public ResponseEntity<Product> findByCode(@RequestParam String code) {
        Optional<Product> optProduct = productRepository.findByCode(code);

        return optProduct.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
