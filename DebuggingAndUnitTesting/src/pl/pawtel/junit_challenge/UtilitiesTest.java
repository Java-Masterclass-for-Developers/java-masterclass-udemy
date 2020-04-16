package pl.pawtel.junit_challenge;

import org.junit.Test;

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
    public void everyNthChar_nGreaterThanStringLength() {
        //Given
        Utilities utilties = new Utilities();
        char[] source = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'h', 'e', 'l', 'l', 'o'};
        //When&Then
        assertArrayEquals(output, utilties.everyNthChar(source, 7));
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
        Utilities utilities = new Utilities();
        int a = 10;
        int b = 5;
        int expectedInt = 300;
        //When
        int result = utilities.converter(a, b);
        //Then
        assertEquals(expectedInt, result);
    }

    @Test
    public void nullIfOddLength_odd() {
        //Given
        Utilities utilities = new Utilities();
        String oddLength = "qwert";
        //When&Then
        assertNull("we will not get null", utilities.nullIfOddLength(oddLength));
    }

    @Test
    public void nullIfOddLength_even() {
        //Given
        Utilities utilities = new Utilities();
        String oddLength = "qwerty";
        //When
        String result = utilities.nullIfOddLength(oddLength);
        // Then
        assertEquals(oddLength, result);
    }
}