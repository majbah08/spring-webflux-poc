package com.majbah.springwebfluxpoc.controller.functional;

import com.majbah.springwebfluxpoc.model.Product;
import com.majbah.springwebfluxpoc.repository.ProductRepository;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ProductHandler {

  private final ProductRepository productRepository;

  Mono<ServerResponse> findById(ServerRequest request, @PathVariable("productId") String productId) {
    return ServerResponse.ok()
      .contentType(MediaType.APPLICATION_JSON)
      .body(productRepository.findById(productId), Product.class);
  }

  Flux<Product> findAll() {
    return productRepository.findAll();
  }

  Mono<Product> create(@RequestBody Product product) {
    return productRepository.save(product);
  }

  Mono<Product> update(@RequestBody Product product, @PathVariable("productId") String productId) {
    return productRepository.save(product);
  }

  Mono<Void> delete(@PathVariable("productId") String productId) {
    return productRepository.deleteById(productId).doOnError(throwable -> {
    });
  }

}
