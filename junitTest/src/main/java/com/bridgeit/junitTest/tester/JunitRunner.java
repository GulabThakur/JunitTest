package com.bridgeit.junitTest.tester;


import org.junit.runner.JUnitCore;

import com.bridgeit.junitTest.simple.SimpleClass;

public class JunitRunner {
		
	public static void main(String[] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(SimpleClass.class);
	}
}
