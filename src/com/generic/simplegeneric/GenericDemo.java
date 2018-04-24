package com.generic.simplegeneric;

public class GenericDemo {

	public static void main(String[] args) {
		SimpleGeneric<String> st = new SimpleGeneric("This is simple generic String");
		System.out.println(st.getSimpleParam());
		st.printType();
		
		SimpleGeneric<Integer> st1 = new SimpleGeneric(100);
		System.out.println(st1.getSimpleParam());
		st1.printType();
	}

}
