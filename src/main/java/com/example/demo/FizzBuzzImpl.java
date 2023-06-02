package com.example.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FizzBuzzImpl implements FizzBuzz {

    private FizzDeterminer fizzDeterminer;
    private BuzzDeterminer buzzDeterminer;
    private FizzBuzzFormatter fizzBuzzFormatter;

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
