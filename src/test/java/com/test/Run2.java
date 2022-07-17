package com.test;

public class Run2  {

	public static void main(String[] args) {
	Run r = new Run();
	Thread th = new Thread(r);
	th.start();
//	th.run();
	System.out.println("hello");
	
	}

}
