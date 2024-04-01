package com.hiberus.microservices.training.springmicroservices.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Identifies and attempt from a {@link User} to solve a {@link Multiplication}
 */
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public final class  MultiplicationResultAttempt {

    private final User user;
    private final Multiplication multiplication;
    private  final int resultAttempt;

    // Empty constructor for serialization of JSON data
    MultiplicationResultAttempt(){
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }


}
