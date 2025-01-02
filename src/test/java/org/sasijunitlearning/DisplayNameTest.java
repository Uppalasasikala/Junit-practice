package org.sasijunitlearning;

import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DisplayNameTest {
    @Test
    @DisplayName("Sasi")
    public void test1()
    {
        System.out.println("This is Test 2");
    }

    @Test
    @DisplayName("Adiseshu")
    public void test2()
    {
        System.out.println("This is Test 1");
    }

    @Test
    @DisplayName("Hitesh")
    public void test3(){
        System.out.println("This is Test 3");
    }

}
