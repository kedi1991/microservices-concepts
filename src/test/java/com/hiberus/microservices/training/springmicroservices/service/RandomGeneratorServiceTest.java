package com.hiberus.microservices.training.springmicroservices.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomGeneratorServiceTest {

    @Autowired
    RandomGeneratorService randomGeneratorService;

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {

        //when a  good sample ot randomly generated factors is genrerated
        List<Integer> randomFactors = IntStream.range(0, 1000).map(
                i -> randomGeneratorService.generateRandomFactor()
        ).boxed().toList();

        //then all of them should be between 10 and 50
        assertThat(randomFactors).containsExactlyElementsOf(IntStream.range(10,50).boxed().toList());
    }
}