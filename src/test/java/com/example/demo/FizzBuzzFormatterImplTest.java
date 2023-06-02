package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzFormatterImplTest {


    private final FizzBuzzFormatter fizzBuzzFormatter = new FizzBuzzFormatterImpl();


    // 3の倍数かつ5の倍数：”FizzBuzz”を返す。
    @Test
    void FizzBuzzRtnTest() {
        assertEquals("FizzBuzz",fizzBuzzFormatter.format(true,true));
    }

    // 3の倍数のみ：”Fizz”を返す。
    @Test
    void FizzRtnTest() {
        assertEquals("Fizz",fizzBuzzFormatter.format(true,false));
    }

    // 5の倍数のみ：”Buzz”を返す。
    @Test
    void BuzzRtnTest() {
        assertEquals("Buzz",fizzBuzzFormatter.format(false,true));
    }

    // 3の倍数でも5の倍数でもない：””を返す。
    @Test
    void nonRtnTest() {
        assertEquals("",fizzBuzzFormatter.format(false,false));
    }

}
