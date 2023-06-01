package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


public class BuzzDeterminerImplTest {


    private final BuzzDeterminer buzzDeterminer = new BuzzDeterminerImpl();

    //    Buzz条件に[該当]：Trueであることを確認
    @Test
    public void buzzReturnTest() {
        int n = 5;
        assertTrue(buzzDeterminer.isPositive(n));
    }

    //    Buzz条件に[該当しない]：Falseであることを確認
    @Test
    void nonBuzzReturnTest() {
        int n = 1;
        assertFalse(buzzDeterminer.isPositive(n));
    }


}
