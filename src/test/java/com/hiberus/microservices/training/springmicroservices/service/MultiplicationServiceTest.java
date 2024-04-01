package com.hiberus.microservices.training.springmicroservices.service;

import com.hiberus.microservices.training.springmicroservices.domain.Multiplication;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssumptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest(){
/**
 * this will fail since we have no implementation of the random generator service
 */
        //BDD: given our mocked service generator with return 50 and 30
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        //when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        //then
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        //assertThat(multiplication.getResult()).isEqualTo(1500);
    }

}