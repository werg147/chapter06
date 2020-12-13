package com.javaex.ex02;

public class ThreadApp {

	public static void main(String agrs[]) {
		
		Thread thread1 = new DigitThread(); //1~9
		Thread thread2 = new LowerThread(); //a~z
		Thread thread3 = new UpperThread(); //A~Z
		
		/*
		thread1.start();
		thread2.start();
		thread3.start();
		*/
		
		thread1.run();
		thread2.run();
		thread3.run();
		
		
		
		
		
		
		
	}
	
	
}
