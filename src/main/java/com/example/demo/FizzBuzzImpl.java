package com.example.demo;

import com.example.demo.FizzDeterminer;
import com.example.demo.BuzzDeterminer;
import com.example.demo.FizzBuzzFormatter;

public class FizzBuzzImpl implements FizzBuzz {

    String str;

    private final FizzDeterminer fizzDeterminer;
    private final BuzzDeterminer buzzDeterminer;
    private final FizzBuzzFormatter fizzBuzzFormatter;

    public FizzBuzzImpl(FizzDeterminer fizzDeterminer, BuzzDeterminer buzzDeterminer, FizzBuzzFormatter fizzBuzzFormatter) {

        this.fizzDeterminer = fizzDeterminer;
        this.buzzDeterminer = buzzDeterminer;
        this.fizzBuzzFormatter = fizzBuzzFormatter;
    }


    @Override
    public String fizzBuzz(int n) {
        // 3の倍数の判定
        boolean fizz = fizzDeterminer.isPositive(n);
        // 5の倍数の判定
        boolean buzz = buzzDeterminer.isPositive(n);
        // 判定結果を使用し、表示文字列の取得
        return fizzBuzzFormatter.format(fizz, buzz);
    }

}
