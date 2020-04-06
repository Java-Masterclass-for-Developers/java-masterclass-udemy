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


        //When
        String oneChange = utilities.removePairs(one);
        String twoChange = utilities.removePairs(two);

        //Then
        assertEquals(oneRemovedPairsExpect, oneChange);
        assertEquals(twoRemovedPairsExpect, twoChange);
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