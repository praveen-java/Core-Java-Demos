package com.generic.simplegeneric;

public class GenericDemo {

	public static void main(String[] args) {
		SimpleGeneric<String, Integer> st = new SimpleGeneric("This is simple generic String", 100);
		System.out.println(st.getSimpleParam()+"    "+st.getSimpleParam1());
		st.printType();
		
		SimpleGeneric<String, Integer> st1 = new SimpleGeneric("This is of simple generic string two type",101);
		System.out.println(st1.getSimpleParam()+"   "+st1.getSimpleParam1());
		st1.printType();
	}

}
