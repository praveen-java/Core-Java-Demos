package com.generic.simplegeneric;

public class SimpleGeneric<T, U> {
	
	private T simpleParam;
	private U simpleParam1;
	
	public SimpleGeneric(T conParam, U conParam1){
		this.simpleParam = conParam;
		this.simpleParam1 = conParam1;
	}
	
	public T getSimpleParam(){
		return this.simpleParam;
	}
	
	public U getSimpleParam1(){
		return this.simpleParam1;
	}
	public void printType(){
		System.out.print("value of simpleParam is ::");System.out.println(this.simpleParam);
		System.out.println("simpleParam is of "+this.simpleParam.getClass().getName()+" Type...");
		
		System.out.print("value of simpleParam1 is ::");System.out.println(this.simpleParam1);
		System.out.println("simpleParam1 is of "+this.simpleParam1.getClass().getName()+" Type...");

	}
}
