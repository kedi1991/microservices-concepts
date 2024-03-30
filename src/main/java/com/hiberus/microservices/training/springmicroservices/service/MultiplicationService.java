package com.hiberus.microservices.training.springmicroservices.service;

import com.hiberus.microservices.training.springmicroservices.domain.Multiplication;

/**
 * Create a random multiplication with random numbers between 10 and 50
 * @return a Multiplication object
 */
public interface MultiplicationService {

    Multiplication createRandomMultiplication();
}
