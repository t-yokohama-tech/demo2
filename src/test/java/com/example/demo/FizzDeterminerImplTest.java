package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzDeterminerImplTest {

    private final FizzDeterminerImpl fizzDeterminer = new FizzDeterminerImpl();

    //    Fizz条件に[該当]：Trueであることを確認
    @Test
    public void fizzReturnTest() {
        assertTrue(fizzDeterminer.isPositive(3));
    }

    //    Fizz条件に[該当しない]：Falseであることを確認
    @Test
    public void nonFizzReturnTest() {
        assertFalse(fizzDeterminer.isPositive(1));
    }

}
