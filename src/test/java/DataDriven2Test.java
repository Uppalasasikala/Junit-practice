import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class DataDriven2Test {
    enum Direction
    {
        EAST, WEST, NORTH, SOUTH
    }
    @ParameterizedTest
    @EnumSource(Direction.class)
    public void testWithEnum(Direction direction)
    {
        System.out.println(direction);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "alex, 30", "brian, 35", "Tom, 45"
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void testWithCSV(String name, int age)
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "Book1.csv")
    public void testWithExCSVFile(String name, int age)
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
    }


}
