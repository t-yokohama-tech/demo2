package com.example.demo;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;


@Component
public class FizzBuzzFormatterImpl implements FizzBuzzFormatter {

    @Override
    public String format(boolean fizz, boolean buzz) {
        // ガード節
        if (fizz && buzz) return "FizzBuzz";
        if (fizz) return "Fizz";
        if (buzz) return "Buzz";
        return "";
        
    }

}


