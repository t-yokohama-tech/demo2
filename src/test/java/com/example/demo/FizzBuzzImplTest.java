package com.example.demo;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.*;

public class FizzBuzzImplTest {

    private final FizzDeterminer fizzDeterminer = mock(FizzDeterminer.class);
    private final BuzzDeterminer buzzDeterminer = mock(BuzzDeterminer.class);
    private final FizzBuzzFormatter fizzBuzzFormatter = mock(FizzBuzzFormatter.class);
    private final FizzBuzz fizzBuzz = new FizzBuzzImpl(fizzDeterminer, buzzDeterminer, fizzBuzzFormatter);


    static Stream<Arguments> fizzBuzz() {
        return Stream.of(
                arguments("FizzBuzz", true, true, 15),// 3の倍数かつ5の倍数：”FizzBuzz”を返す。
                arguments("Fizz", true, false, 3),// 3の倍数のみ：”Fizz”を返す。
                arguments("Buzz", false, true, 5),// 5の倍数のみ：”Buzz”を返す。
                arguments("", false, false, 11)// 3の倍数でも5の倍数でもない：””を返す。
        );
    }

    // 上記４つのパターンを１メソッドでテスト。
    @ParameterizedTest
    @MethodSource("fizzBuzz")
    void RtnTest(String expected, boolean fizz, boolean buzz, int n) {

        // mock の振る舞いを仕込む
        doReturn(fizz).when(fizzDeterminer).isPositive(anyInt());
        doReturn(buzz).when(buzzDeterminer).isPositive(anyInt());
        doReturn(expected).when(fizzBuzzFormatter).format(anyBoolean(),anyBoolean());
        // テスト対象コードを実行
        var result = fizzBuzz.fizzBuzz(n);

        // 結果の確認
        assertEquals(expected, result);
        verify(fizzDeterminer).isPositive(n);
        verify(buzzDeterminer).isPositive(n);
        verify(fizzBuzzFormatter).format(fizz,buzz);
    }



}
