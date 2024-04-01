package com.hiberus.microservices.training.springmicroservices.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
@RequiredArgsConstructor
/**
 * Stores information to Identify the user
 */
public class User {

    private final String alias;

    //for JSON serialization
    protected User(){
        this(null);
    }

}
