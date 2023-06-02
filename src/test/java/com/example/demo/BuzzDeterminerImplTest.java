package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BuzzDeterminerImplTest {


    private final BuzzDeterminer buzzDeterminer = new BuzzDeterminerImpl();

    //    Buzz条件に[該当]：Trueであることを確認
    @Test
    public void buzzReturnTest() {
        assertTrue(buzzDeterminer.isPositive(5));
    }

    //    Buzz条件に[該当しない]：Falseであることを確認
    @Test
    void nonBuzzReturnTest() {
        assertFalse(buzzDeterminer.isPositive(1));
    }


}
