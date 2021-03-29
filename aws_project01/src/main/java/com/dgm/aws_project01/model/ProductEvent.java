package com.dgm.aws_project01.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductEvent {

    @EqualsAndHashCode.Include
    private long productId;

    private String code;

    private String username;
}
