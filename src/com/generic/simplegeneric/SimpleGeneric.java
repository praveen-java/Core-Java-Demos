package com.generic.simplegeneric;

public class SimpleGeneric<T> {
	
	private T simpleParam;
	
	public SimpleGeneric(T conParam){
		this.simpleParam = conParam;
	}
	
	public T getSimpleParam(){
		return this.simpleParam;
	}
	
	public void printType(){
		System.out.print("value of simpleParam is ::");System.out.println(this.simpleParam);
		System.out.println("simpleParam is of "+this.simpleParam.getClass().getName()+" Type...");
	}
}
