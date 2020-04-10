package pl.pawtel.junit_challenge;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        //Given
        Utilities utilties = new Utilities();
        char[] source = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'e', 'l'};
        //When&Then
        assertArrayEquals(output, utilties.everyNthChar(source, 2));
    }

    @Test
    public void removePairs() {
        //Given
        Utilities utilities = new Utilities();

        String one = "AA BBCDDDEFF";
        String oneRemovedPairsExpect = "A BCDEF";


        String two = "ABCCABDEEF";
        String twoRemovedPairsExpect = "ABCABDEF";

        String three = "A";
        String threeRemovedPairsExpect = "A";

        String four = null;
        String fourRemovedPairsExpect = null;

        String five = "";
        String fiveRemovedPairsExpect = "";


        //When&Then
        assertEquals(oneRemovedPairsExpect, utilities.removePairs(one));
        assertEquals(twoRemovedPairsExpect, utilities.removePairs(two));
        assertEquals(threeRemovedPairsExpect, utilities.removePairs(three));
        assertNull("we will not get null", utilities.removePairs(null));
        assertEquals(fiveRemovedPairsExpect, utilities.removePairs(five));
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