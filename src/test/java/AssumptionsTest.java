import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest
{
   private int addNumbers(int a,int b)
   {
       return a+b;
   }

   @Test
   public void testAddition()
   {
       int num1=5;
       int num2=0;

       assumingThat(num1>0 && num2>0,()->{
           System.out.println("Hey your assumptions is correct");
           int sum = addNumbers(num1,num2);
           assertEquals(12,sum);
           System.out.println(sum);

       });
       System.out.println("Assumption done");

   }
}
