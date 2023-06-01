package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class BuzzDeterminerImpl implements BuzzDeterminer {

    //nが5の倍数の時にTrueを返す。

    @Override
    public boolean isPositive(int n) {

        return n % 5 == 0;

    }
}
