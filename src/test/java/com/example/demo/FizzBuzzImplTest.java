package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FizzBuzzImplTest {


    int n;
    private final FizzDeterminer fizzDeterminer = mock(FizzDeterminer.class);
    private final BuzzDeterminer buzzDeterminer = mock(BuzzDeterminer.class);
    private final FizzBuzzFormatter fizzBuzzFormatter = mock(FizzBuzzFormatter.class);
    private final FizzBuzz fizzBuzz = new FizzBuzzImpl(fizzDeterminer, buzzDeterminer, fizzBuzzFormatter);


    // 3の倍数　「Fizz」を返す。
    @Test
    void FizzRtnTest() {
        n = 3;
        doReturn(true).when(fizzDeterminer).isPositive(n);
        doReturn(false).when(buzzDeterminer).isPositive(n);
        doReturn("Fizz").when(fizzBuzzFormatter).format(true, false);
        assertEquals("Fizz", fizzBuzz.fizzBuzz(n));
    }

    // 5の倍数　「Buzz」を返す。
    @Test
    void BuzzRtnTest() {
        n = 5;
        doReturn(false).when(fizzDeterminer).isPositive(n);
        doReturn(true).when(buzzDeterminer).isPositive(n);
        doReturn("Buzz").when(fizzBuzzFormatter).format(false, true);
        assertEquals("Buzz", fizzBuzz.fizzBuzz(n));
    }

    // 3と5の倍数　「FizzBuzz」を返す。
    @Test
    void FizzBuzzRtnTest() {
        n = 15;
        doReturn(true).when(fizzDeterminer).isPositive(n);
        doReturn(true).when(buzzDeterminer).isPositive(n);
        doReturn("FizzBuzz").when(fizzBuzzFormatter).format(true, true);
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(n));
    }

    // 3の倍数でも5の倍数でもないとき　「」(空文字)を返す。
    @Test
    void nonRtnTest() {
        n = 11;
        doReturn(false).when(fizzDeterminer).isPositive(n);
        doReturn(false).when(buzzDeterminer).isPositive(n);
        doReturn("").when(fizzBuzzFormatter).format(false, false);
        assertEquals("", fizzBuzz.fizzBuzz(n));
    }

}
