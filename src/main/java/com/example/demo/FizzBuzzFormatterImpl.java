package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzFormatterImpl implements FizzBuzzFormatter{

    @Override
    public String format(boolean fizz, boolean buzz) {

        if(fizz && buzz) {
            return "FizzBuzz";
        } else if(fizz) {
            return "Fizz";
        } else if(buzz) {
            return  "Buzz";
        } else {
            return "";
        }

    }

}


