package com.dgm.aws.aws_project01.mode;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode
public class DogFood {

    private final String name;

    private final String brand;

    private final Double price;

    private final int stock;
}
