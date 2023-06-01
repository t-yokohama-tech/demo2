package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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


