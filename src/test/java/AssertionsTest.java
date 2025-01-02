import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void standardAssertions()
    {
        String expectedValue = "Faang";
       String actualValue = "Faang";

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void groupAssertions()
    {
        assertAll("Heading", () -> assertEquals("One","One"),
                ()-> assertEquals("Two","Two"));
    }

 @Test
    public void checkingNull()
    {
        String value = null;

        assertNull(value);
   }

    @Test
    public void checkingNotNull()
    {
        String value = "Apple";

        assertNotNull(value);
    }

}
