import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    //test that arabic numbers are converted to roman numerals correctly
    private final RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    void expect_10_to_be_X(){
        String expected = "X";
        String actual = romanNumerals.converter(10);

        assertEquals(expected, actual);
    }

    @Test
    void expect_5_to_be_V(){
        String expected = "V";
        String actual = romanNumerals.converter(5);

        assertEquals(expected, actual);
    }

    @Test
    void expect_9_to_be_IX(){
        String expected = "IX";
        String actual = romanNumerals.converter(9);

        assertEquals(expected, actual);
    }

    @Test
    void expect_1329_to_be_MCCCXXIX(){
        String expected = "MCCCXXIX";
        String actual = romanNumerals.converter(1329);

        assertEquals(expected, actual);
    }
}