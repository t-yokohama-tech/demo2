package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class FizzBuzzFormatterImpl implements FizzBuzzFormatter {


    private static final Map<Boolean, String> fizzMap = Map.of(
            Boolean.TRUE, "Fizz",
            Boolean.FALSE, ""
    );

    private static final Map<Boolean, String> buzzMap = Map.of(
            Boolean.TRUE, "Buzz",
            Boolean.FALSE, ""
    );

    @Override
    public String format(boolean fizz, boolean buzz) {
        return fizzMap.get(fizz) + buzzMap.get(buzz);
    }

}




