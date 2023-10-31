package com.majbah.springwebfluxpoc.controller;

import com.majbah.springwebfluxpoc.model.Product;
import com.majbah.springwebfluxpoc.repository.ProductRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping
public class ProductController {

  private final ProductRepository productRepository;

  @GetMapping("products/{productId}")
  Mono<Product> findById(@PathVariable("productId") String productId) {
    return productRepository.findById(productId);
  }

  @GetMapping("products")
  Flux<Product> findAll() {
    return productRepository.findAll();
  }

  @PostMapping("products")
  Mono<Product> create(@RequestBody Product product) {
    return productRepository.save(product);
  }

  @PutMapping("products/{productId}")
  Mono<Product> update(@RequestBody Product product,@PathVariable("productId") String productId) {
    return productRepository.save(product);
  }

  @DeleteMapping("{productId}")
  Mono<Void> delete(@PathVariable("productId") String productId) {
    return productRepository.deleteById(productId).doOnError(throwable -> {
    });
  }
}
