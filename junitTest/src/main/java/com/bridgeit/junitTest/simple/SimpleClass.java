package com.bridgeit.junitTest.simple;

public class SimpleClass {
		public boolean evenNumber(int num) {
			boolean result;
			if(num%2==0) {
				result= true;
			}else {
				result= false;
			}
			return result;
		}
}
