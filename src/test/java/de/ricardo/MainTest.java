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
  
}