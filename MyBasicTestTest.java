/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingJunit;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author cowcutta
 */
public class MyBasicTestTest {
    
    

    /**
     * Test of several assert methods.
     */
    
    
    @Test
    public void assertEqual1() {
        System.out.println("add");
        String stringOne = "5";
        String stringTwo = "10";
        TestAssertEquals instance = new TestAssertEquals();
        int expResult = 15;
        int result = instance.add(stringOne, stringTwo);
        assertEquals(expResult, result);
    }
    
   @Test
    public void assertArrayEqual1() {
        System.out.println("additionalArray-arrayEquals");
        int[] numbers = new int[]{7,8};
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        int[] expResult = new int[]{9,10};
        int[] result = instance.additionalArray(numbers);
        assertArrayEquals(expResult, result);
    }
    
     @Test
    public void assertFalse2() {
        System.out.println("stringComp-false");
        String one = "hot";
        String two = "cold";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        assertFalse(instance.stringComp(one, two));
    }
    
    @Test
    public void assertNotNull1() {
        System.out.println("addition-notnull");
        String stringOne = "10";
        String stringTwo = "10";
        TestAssertEquals instance = new TestAssertEquals();
        int result = instance.addition(stringOne, stringTwo);
        assertNotNull(result);
    }
    
    @Test
    public void assertNotSame2() {
        System.out.println("compareString-notsame");
        String one = "hot";
        String two = "cold";
        assertNotSame(one, two);
    }
    
    @Test
    public void assertNull2() {
        System.out.println("stringCnct-null");
        String one = null;
        String two = null;
        assertNull(one, two);
    }    
    
     @Test
    public void assertSame1() {
        System.out.println("compareString-same");
        String one = "band";
        String two = "band";
        assertSame(one, two);
    }
    
     @Test
    public void assertThat1(){
       System.out.println("assertThat");
        assertThat("They match", "band", is("band"));
    }
    
    @Test
    public void assertTrue1() {
        System.out.println("compareString-true");
        String one = "Band";
        String two = "Band";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        assertTrue(instance.compareString(one, two));
    }

   
    
     
}
