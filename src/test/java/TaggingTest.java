import org.junit.jupiter.api.*;

public class TaggingTest {
    @Test
    @Tag("SmokeTest")
    public void test1()
    {
        System.out.println("Smoke Test1");
    }

    @Test
    @Tag("RegressionTest")
    public void test2()
    {
        System.out.println("Sanity Test");
    }

    @Test
    @Tag("SmokeTest")
    public void test3()
    {
        System.out.println("Regression Test");
    }
}
