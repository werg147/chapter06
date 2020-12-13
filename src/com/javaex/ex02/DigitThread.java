package com.javaex.ex02;

public class DigitThread extends Thread{

	
	public void run() {
		for(int num=1; num<10; num++) {
			System.out.print(num);
		}
	}
	
	
	
}
