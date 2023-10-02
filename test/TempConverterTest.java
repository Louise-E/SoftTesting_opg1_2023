import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TempConverterTest {

    private final TempConverter tempConverter = new TempConverter();

    @Test
    void expect_32_fahrenheit_to_be_0_celsius(){
        float expected = 0;
        float actual = tempConverter.converter(32, "fahrenheit");

        assertEquals(expected, actual);
    }

    @Test
    void expect_100_fahrenheit_to_be_37_celsius(){
        float expected = 37.77778f;
        float actual = tempConverter.converter(100, "fahrenheit");

        assertEquals(expected, actual);
    }

    @Test
    void expect_0_celsius_to_be_32_fahrenheit(){
        float expected = 32f;
        float actual = tempConverter.converter(0, "celsius");

        assertEquals(expected, actual);
    }

    @Test
    void expect_37_celsius_to_be_98_6_fahrenheit(){
        float expected = 98.6f;
        float actual = tempConverter.converter(37, "celsius");

        assertEquals(expected, actual);
    }

}