package de.ricardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void createArray_shouldReturnCorrectArray() {
        //GIVEN
        int[] expected = {1,2,3,4,5};

        //WHEN
        int[] actual = Main.createArray();

        // THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSumOfTwoNumbers(){
        // GIVEN
        int a = 12;
        int b = 13;
        int expected = 25;

        //WHEN
        int actual = Main.add(a,b);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void testNumberIsEven(){
        // GIVEN
        int number = 4;

        //WHEN
        boolean actual = Main.isEven(number);

        //THEN
        assertTrue(actual);
    }
  
}