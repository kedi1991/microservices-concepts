package com.hiberus.microservices.training.springmicroservices.service;

import com.hiberus.microservices.training.springmicroservices.domain.Multiplication;
import com.hiberus.microservices.training.springmicroservices.domain.MultiplicationResultAttempt;


public interface MultiplicationService {
    /**
     * Create a random multiplication with random numbers
     * @return Multiplication object
     */
    Multiplication createRandomMultiplication();

    /**
     * Return true if the attempt matches the multiplication result, false otherwise
     * @param resultAttempt
     * @return Boolean
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}
