package com.majbah.springwebfluxpoc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
  @Id
  private String id;
  private String name;
  private String category;
  private Integer rating;
  private String description;
}
