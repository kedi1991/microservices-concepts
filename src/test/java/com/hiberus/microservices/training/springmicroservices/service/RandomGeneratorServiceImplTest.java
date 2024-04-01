package com.hiberus.microservices.training.springmicroservices.service;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
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
        List<Integer> randomFactors = IntStream.range(0,1000).map(i -> randomGeneratorServiceImpl.generateRandomFactor()).boxed().toList();

        //then all of them should be between 10 and 50
        assertThat(randomFactors).containsExactlyElementsOf(IntStream.range(10,50).boxed().toList());
    }
}
