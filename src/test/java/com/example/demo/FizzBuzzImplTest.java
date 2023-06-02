package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzImplTest {

    private final FizzBuzz fizzBuzz = new FizzBuzzImpl();

    int n;

    // 3の倍数　「Fizz」を返す。
    @Test
    void FizzRtnTest() {
        n = 3;
        assertEquals("Fizz", fizzBuzz.fizzBuzz(n));
    }

    // 5の倍数　「Buzz」を返す。
    @Test
    void BuzzRtnTest() {
        n = 5;
        assertEquals("Buzz", fizzBuzz.fizzBuzz(n));
    }

    // 3と5の倍数　「FizzBuzz」を返す。
    @Test
    void FizzBuzzRtnTest() {
        n = 15;
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(n));
    }

    // 3の倍数でも5の倍数でもないとき　「」(空文字)を返す。
    @Test
    void nonRtnTest() {
        n = 11;
        assertEquals("", fizzBuzz.fizzBuzz(n));
    }

}
