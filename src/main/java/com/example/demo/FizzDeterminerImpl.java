package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FizzDeterminerImpl implements FizzDeterminer {

    //nが3の倍数の時にTrueを返す。

    @Override
    public boolean isPositive(int n) {

        return n % 3 == 0;

    }
}
