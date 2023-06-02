package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzDeterminerImplTest {

    private final FizzDeterminerImpl fizzDeterminer = new FizzDeterminerImpl();

    //    Fizz条件に[該当]：Trueであることを確認
    @Test
    public void fizzReturnTest() {
        int n = 3;
        assertTrue(fizzDeterminer.isPositive(n));
    }

    //    Fizz条件に[該当しない]：Falseであることを確認
    @Test
    public void nonFizzReturnTest() {
        int n = 1;
        assertFalse(fizzDeterminer.isPositive(n));
    }
}
