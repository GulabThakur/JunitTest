package com.bridgeit.junitTest.tester;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.bridgeit.junitTest.simple.SimpleClass;


public class TestClass {
		
		@Test
		public void testMethod() {
				 SimpleClass simple=new SimpleClass();
				 assertEquals("10 is a even number", true, simple.evenNumber(20));
				 assertEquals("10 is a even number", true, simple.evenNumber(10));
				 assertEquals("10 is a even number", true, simple.evenNumber(200));
				 System.out.println("sucess full test");
		}
	
}
