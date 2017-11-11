/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cowcutta
 */
public class MyBasicTestTest {
    
    public MyBasicTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MyBasicTest.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "5";
        String s2 = "5";
        MyBasicTest instance = new MyBasicTest();
        int expResult = 10;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    public void testAdd2() {
        System.out.println("add");
        String s1 = "5";
        String s2 = "10";
        MyBasicTest instance = new MyBasicTest();
        int expResult = 6;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
}
