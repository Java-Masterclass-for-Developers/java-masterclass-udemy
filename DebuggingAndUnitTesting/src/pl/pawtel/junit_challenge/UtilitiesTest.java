package pl.pawtel.junit_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        //Given
        fail("Methods fails; write testing code");
        //When

        //Then
    }

    @Test
    public void removePairs() {
        //Given
        Utilities utilities = new Utilities();

        String one = "AABCDDEFF";
        String oneRemovedPairsExpect = "ABCDEF";

        String two = "ABCCABDEEF";
        String twoRemovedPairsExpect = "ABCABDEF";

        //When&Then
        assertEquals(oneRemovedPairsExpect, utilities.removePairs(one));
        assertEquals(twoRemovedPairsExpect, utilities.removePairs(two));
    }

    @Test
    public void converter() {
        //Given
        fail("Methods fails; write testing code");
        //When

        //Then
    }

    @Test
    public void nullIfOddLength() {
        //Given
        fail("Methods fails; write testing code");
        //When

        //Then
    }
}