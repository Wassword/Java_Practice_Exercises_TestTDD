package com.win.junit;

import org.example.Warmup1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Warmup1Test {
    Warmup1 warmup1 = new Warmup1();

    @DisplayName("Test Warmup1() method")
    @Test
    void testSleepIn(){
        assertTrue(warmup1.sleepIn(false,false));
        assertTrue(warmup1.sleepIn(false,false));
        assertFalse(warmup1.sleepIn(true, false));

    }
    @Test
    void testNearHundred() {
        assertTrue(warmup1.nearHundred(93));
        assertTrue(warmup1.nearHundred(90));
        assertFalse(warmup1.nearHundred(89));
        assertTrue(warmup1.nearHundred(200));
        assertFalse(warmup1.nearHundred(211));

    }

    @Test
    void testMonkeyTrouble(){
        assertTrue(warmup1.monkeyTrouble(true,true));
        assertTrue(warmup1.monkeyTrouble(false,false));
        assertFalse(warmup1.monkeyTrouble(true,false));
    }

    @Test
    void testSumDouble(){
        assertEquals(3, warmup1.sumDouble(1,2));
        assertEquals(5, warmup1.sumDouble(2,3));
        assertEquals(16, warmup1.sumDouble(4,4));
    }

    @Test
    void testDiff21(){
        assertEquals(2, warmup1.diff21(19));
        assertEquals(0, warmup1.diff21(21));
        assertEquals(8, warmup1.diff21(25));
    }
}
