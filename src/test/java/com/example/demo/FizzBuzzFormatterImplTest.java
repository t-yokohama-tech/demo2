package com.example.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class FizzBuzzFormatterImplTest {


    private final FizzBuzzFormatter fizzBuzzFormatter = new FizzBuzzFormatterImpl();


    static Stream<Arguments> fizzBuzzFormatter() {
        return Stream.of(
                arguments("FizzBuzz", true, true),// 3の倍数かつ5の倍数：”FizzBuzz”を返す。
                arguments("Fizz", true, false),// 3の倍数のみ：”Fizz”を返す。
                arguments("Buzz", false, true),// 5の倍数のみ：”Buzz”を返す。
                arguments("", false, false)// 3の倍数でも5の倍数でもない：””を返す。

        );
    }
    // 上記４つのパターンを１メソッドでテスト。
    @ParameterizedTest
    @MethodSource("fizzBuzzFormatter")
    void RtnTest(String expected, boolean fizz, boolean buzz) {
        assertEquals(expected,fizzBuzzFormatter.format(fizz, buzz));
    }



}
