package com.threadsamples;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ThreadClass {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Runnable myRunnable = new Runnable() {
			public void run() {
				System.out.println("Start :: " + Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}

		};

		Thread one = new Thread(myRunnable);
		Thread two = new Thread(myRunnable);

		one.start();
		two.start();
		List<Thread> threads = ThreadClass.getThreadsForRunnable(myRunnable);
		for(Thread thread : threads) {
			System.out.println("in Exec the thread :: "+thread.getName());
		}
	}

	private static List<Thread> getThreadsForRunnable(Runnable myRunnable) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method getThreads = Thread.class.getDeclaredMethod("getThreads");
		Field target = Thread.class.getDeclaredField("target");
		target.setAccessible(true);
		getThreads.setAccessible(true);
		
		Thread[] threadList = (Thread[]) getThreads.invoke(null);
		List<Thread> result = new ArrayList<Thread>();
		for(Thread thread  : threadList) {
			Object runnable = target.get(thread);
			if(runnable == myRunnable ) {
				result.add(thread);
			}
		}
		return result;
	}
}
