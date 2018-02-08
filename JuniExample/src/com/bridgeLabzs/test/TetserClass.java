package com.bridgeLabzs.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgeLabzs.simple.SimpleClass;

public class TetserClass {
	int var;
	SimpleClass simple=new SimpleClass();

    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case addition and sub");  
        var=17;
        assertEquals(var,simple.addition(8, 9));
        System.out.println("result :"+var);
        var=1;
        assertEquals(var,simple.sub(8, 7));  
        System.out.println("result :"+var);
    } 
    @Ignore
    @Test  
    public void testCube(){  
        System.out.println("test case division");
        var=5;
        assertEquals(5,simple.division(25, 5));
        System.out.println("result :"+var);
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case squre of 5");  
        var =25;
        assertEquals(var,simple.squre(5));
        System.out.println("result :"+var);
        
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
  
}  

