package com.majbah.springwebfluxpoc.controller;

import com.majbah.springwebfluxpoc.model.Product;
import com.majbah.springwebfluxpoc.repository.ProductRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping
public class ProductController {

  private final ProductRepository productRepository;

  Mono<Product> findById(){
    return Mono.empty();
  }
}
