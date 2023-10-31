package com.majbah.springwebfluxpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringWebfluxPocApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringWebfluxPocApplication.class, args);
  }

}
