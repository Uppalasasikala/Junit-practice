import org.junit.jupiter.api.RepeatedTest;

public class RepeatTest {
    @RepeatedTest(value = 4, name = "Faang - Repeat {currentRepetition} of {totalRepetitions}")
    public void printNumbers()
    {
        System.out.println("Repeating Test");
    }
}
