package com.hiberus.microservices.training.springmicroservices.domain;

/**
 * A class that represents a multiplication in the application
 */

import lombok.*;

/**
 * using lombok
 */

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Multiplication {

    //Both factors
    private final int factorA;
    private final int factorB;

    //empty constructor for JSON (de)serialization
    Multiplication(){
        this(0,0);
    }

}
