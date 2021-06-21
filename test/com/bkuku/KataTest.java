package com.bkuku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void displayGrade() {

        assertEquals("A", Kata.DisplayGrade(90));
    }

    @Test
    public void toDisplayGradeForB() {
        assertEquals("B", Kata.DisplayGrade(80));
    }

    @Test
    public void toDisplayGradeForC() {
        assertEquals("C", Kata.DisplayGrade(70));
    }

    @Test
    public void toDisplayGradeForD() {
        assertEquals("D",Kata.DisplayGrade(60));
    }

    @Test
    public void toDisplayGradeForF() {
        assertEquals("F", Kata.DisplayGrade(50));

    }

    @Test
    public void toShowTotalPiceResellerBuysBetweenOneToFourCopies() {
        assertEquals(3 * 1500, Kata.totalPriceResellerBuys(3));
    }

    @Test
    public void toShowTotalPiceResellerBuysBetweenFiveToNineCopies() {

        assertEquals(6 * 1400, Kata.totalPriceResellerBuys(6));
    }

    @Test
    public void toShowTotalPiceResellerBuysTenToTwentyNine() {
        assertEquals(10 * 1200, Kata.totalPriceResellerBuys(10));
    }

    @Test
    public void toShowTotalPiceResellerBuysBetweenThirtyToFourtyNine() {
        assertEquals(35 * 1100,Kata.totalPriceResellerBuys(35));
    }

    @Test
    public void toShowTotalPiceResellerBuysBetweenFiftyToNinetyNie() {

        assertEquals(50 * 1000, Kata.totalPriceResellerBuys(50));
    }

    @Test
    public void toShowTotalPiceResellerBuysBetweenOneHundredToOneHundredAndNinetyNine() {

        assertEquals(100 * 900, Kata.totalPriceResellerBuys(100));
    }

    @Test
    public void toShowTotalResellerProfitBetweenOneToFourCopies() {

        assertEquals((4500 * 3) - (1500 * 3), Kata.totalResellerProfit(3));
    }

    @Test
    public void toShowTotalResellerProfitBetweenFiveToNineCopies() {
        assertEquals((8400 * 6) - (1400 * 6), Kata.totalResellerProfit(6));
    }

    @Test
    public void toShowTotalResellerProfitBetweenTenToTwentyNineCopies() {
        assertEquals((12000 * 10) - (1200 * 10),Kata.totalResellerProfit(10));
    }

    @Test
    public void toShowTotalResellerProfitBetweenThirthyToFourtyNineCopies() {

        assertEquals((38500 * 35) - (1100 * 35),Kata.totalResellerProfit(35));
    }

    @Test
    void toShowTotalResellerProfitBetweenFiftyToNinetyNineCopies() {

        assertEquals((50000 * 50) - (1000 * 50),Kata.totalResellerProfit(50));
    }

    @Test
    public void toShowTotalResellerProfitBetweenOneHundredToOneHundredAndNinetyNine() {

        assertEquals((90000 * 100) - (900 * 100),Kata.totalResellerProfit(100));
    }



    }





