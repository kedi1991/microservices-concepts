package com.hiberus.microservices.training.springmicroservices.service;

import java.util.Random;

public class RandomGeneratorServiceImpl implements  RandomGeneratorService{

    final static int MIN_FACTOR = 10;
    final static int MAX_FACTOR = 20;
    @Override
    public int generateRandomFactor() {
        return new Random().nextInt((MAX_FACTOR-MIN_FACTOR)+1) + MIN_FACTOR;
    }
}
