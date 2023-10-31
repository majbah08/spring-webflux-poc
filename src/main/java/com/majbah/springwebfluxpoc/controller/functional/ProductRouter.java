package com.majbah.springwebfluxpoc.controller.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ProductRouter {

  @Bean
  public RouterFunction<ServerResponse> functionalRoutes(ProductHandler handler){

    return RouterFunctions.nest("api/products",handler).route(RequestPredicates.GET("poducts/{productId}"), handler::findById);

  }

  RouterFunction<ServerResponse> route = route()

    .GET("/person/{id}", accept(APPLICATION_JSON), handler::getPerson)

    .GET("/person", accept(APPLICATION_JSON), handler::listPeople)

    .POST("/person", handler::createPerson)

    .add(otherRoute)

    .build();
}
