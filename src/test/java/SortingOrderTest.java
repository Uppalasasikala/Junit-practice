import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortingOrderTest {
    @Test
    @Order(1)
    public void cat()
    {
        System.out.println("This is Test 1");
    }

    @Test
    @Order(3)
    public void box()
    {
        System.out.println("This is Test 3");
    }

    @Test
    @Order(2)
    public void apple()
    {
        System.out.println("This is Test 2");
    }
}
