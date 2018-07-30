package com.threadsamples;

import java.lang.Thread.UncaughtExceptionHandler;

class ThreadDemo {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public  void run() {
				throw new NullPointerException();
			}
		};
		th.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread arg0, Throwable arg1) {
				System.out.println("This is caught");
				arg1.printStackTrace();
			}
		});
		
		th.start();
		
	}
	
	

}
