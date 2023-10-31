package com.majbah.springwebfluxpoc.repository;

import com.majbah.springwebfluxpoc.model.Product;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
