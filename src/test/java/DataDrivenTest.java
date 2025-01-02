import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class DataDrivenTest {
     @ParameterizedTest(name = "{index}")
    @ValueSource(strings = {"Sasikala","Adiseshu"})
    public void testValue(String word)
    {
        System.out.println(word.length());
    }

    @ParameterizedTest
    @NullSource
    public void testNullSource(String argument)
    {
        assertTrue(argument == null);
        System.out.println(argument);
    }

    @ParameterizedTest
    @EmptySource
    public void testEmptySource(String argument)
    {
        assertTrue(argument.isEmpty());
        System.out.println(argument);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testNullEmptySource(String argument)
    {
        System.out.println(argument);
    }

}
