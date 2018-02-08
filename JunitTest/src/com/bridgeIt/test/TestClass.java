package com.bridgeIt.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgeIt.simple.SimpleClass;

public class TestClass {
	
	@Test 
	public void testPrintMessage() {
	      assertEquals("stest sucessfull",true,SimpleClass.even(10));
	   }
}
