package com.hiberus.microservices.training.springmicroservices.service;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
public class RandomGeneratorServiceImplTest {
    private RandomGeneratorServiceImpl randomGeneratorServiceImpl;

    @Before
    public void setUp(){
        randomGeneratorServiceImpl =  new RandomGeneratorServiceImpl();
    }

    @Test
    public  void generateRandomFactorIsBetweenExpectedLimits(){
        //when a good sample of randomly generated factors is generated
        List<Integer> randomFactors = IntStream.range(10,50).map(i -> randomGeneratorServiceImpl.generateRandomFactor()).boxed().collect(Collectors.toList());

        //then all of them should be between 10 and 50
        assertThat(randomFactors).allMatch(factor -> factor< 50 && factor >= 10);
    }
}
