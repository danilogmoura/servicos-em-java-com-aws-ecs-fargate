package com.dgm.aws.aws_project01.controller;

import com.dgm.aws.aws_project01.mode.DogFood;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Test controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }

    @GetMapping("/dog/food/{name}")
    public ResponseEntity<?> dogFood(@PathVariable String name) {
        LOG.info("Name: {}", name);

        DogFood dogFood = DogFood.builder()
                .name(name)
                .brand(new Faker().funnyName().name())
                .price(new Faker().number().randomDouble(2, 0, 100))
                .stock(new Faker().number().numberBetween(0, 100))
                .build();

        return ResponseEntity.ok(dogFood);
    }
}
