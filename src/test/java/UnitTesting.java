import org.junit.jupiter.api.*;


public class UnitTesting {
    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("This is before all");
    }


    @BeforeEach
    public void beforeEach()
    {
        System.out.println("This is before each");
    }

    @Test
    public void apple(){
        System.out.println("Hello this is test 1");
    }

    @Test
    public void box(){
        System.out.println("Hello this is test 2");
    }
    @Test
    public void cat(){
        System.out.println("Hello this is test 3");
    }
    @AfterEach
    public void tearDown()
    {
        System.out.println("This is after Each");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("This is after All");
    }
}
