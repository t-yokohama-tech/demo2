package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzFormatterImplTest {


    private final FizzBuzzFormatter fizzBuzzFormatter = new FizzBuzzFormatterImpl();

    boolean fizz;
    boolean buzz;

    // 3の倍数かつ5の倍数：”FizzBuzz”を返す。
    @Test
    void FizzBuzzRtnTest() {
        fizz=true;
        buzz=true;
        assertEquals("FizzBuzz",fizzBuzzFormatter.format(fizz,buzz));
    }

    // 3の倍数のみ：”Fizz”を返す。
    @Test
    void FizzRtnTest() {
        fizz=true;
        buzz=false;
        assertEquals("Fizz",fizzBuzzFormatter.format(fizz,buzz));
    }

    // 5の倍数のみ：”Buzz”を返す。
    @Test
    void BuzzRtnTest() {
        fizz=false;
        buzz=true;
        assertEquals("Buzz",fizzBuzzFormatter.format(fizz,buzz));
    }
    // 3の倍数でも5の倍数でもない：””を返す。
    @Test
    void nonRtnTest() {
        fizz=false;
        buzz=false;
        assertEquals("",fizzBuzzFormatter.format(fizz,buzz));
    }

}
