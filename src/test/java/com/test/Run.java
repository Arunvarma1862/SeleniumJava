package com.test;

public class Run  implements Runnable {

@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	System.out.println("hiii");
}
}
