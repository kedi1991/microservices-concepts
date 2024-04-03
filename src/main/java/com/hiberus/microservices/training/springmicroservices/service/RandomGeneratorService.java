package com.hiberus.microservices.training.springmicroservices.service;

import org.springframework.stereotype.Service;

/**
 * @return a random factor between 10 and 50
 */

@Service
public interface RandomGeneratorService {

    int generateRandomFactor();
}
