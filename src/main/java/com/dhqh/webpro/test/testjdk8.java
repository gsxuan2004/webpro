package com.dhqh.webpro.test;

public class testjdk8 {
 
	public static void main(String[] args) throws InterruptedException {
		mathoperatetest px=(a,b)->a+b;
		
		System.out.println(px.operate(1, 2));
		//new Thread(() -> System.out.println("Hello World!"));
		System.out.println("Hello World!");
		
		Runnable r = () -> System.out.println("do something.");
		r.run();
	}
	interface mathoperatetest{
		int operate(int a,int b);
	}
}
