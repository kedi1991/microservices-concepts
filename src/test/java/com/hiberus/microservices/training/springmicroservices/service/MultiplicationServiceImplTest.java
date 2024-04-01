package com.hiberus.microservices.training.springmicroservices.service;

import com.hiberus.microservices.training.springmicroservices.domain.Multiplication;
import com.hiberus.microservices.training.springmicroservices.domain.MultiplicationResultAttempt;
import com.hiberus.microservices.training.springmicroservices.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationServiceImplTest {

    @Mock
    private RandomGeneratorService randomGeneratorService;

    private MultiplicationServiceImpl multiplicationServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
    }

    @Test
    public void createRandomMultiplicationTest(){
        //given that the random generator service will return 30 and 50
        BDDMockito.given(randomGeneratorService.generateRandomFactor()).willReturn(30,50);
        //when
        Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();

        //assert
        assertThat(multiplication.getFactorA()).isEqualTo(30);
        assertThat(multiplication.getFactorB()).isEqualTo(50);
        //assertThat(multiplication.getResult()).isEqualTo(1500);

    }

    @Test
    public void checkCorrectAttemptTest(){
        //given
        Multiplication multiplication = new Multiplication(10,10);
        User user = new User("Okurut Kedi");
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 100);

        //when
        boolean resultAttempt = multiplicationServiceImpl.checkAttempt(attempt);

        //assert
        assertThat(resultAttempt).isTrue();
    }

    @Test
    public void checkWrongAttemptTest(){
        //given
        Multiplication multiplication = new Multiplication(10,10);
        User user = new User("Akudo angella");
        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 101);

        //when
        boolean resultAttempt = multiplicationServiceImpl.checkAttempt(attempt);

        //Assert
        assertThat(resultAttempt).isFalse();
    }

}