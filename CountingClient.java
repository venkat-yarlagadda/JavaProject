package com.threads;

public class Counter {
	static int count=0;
	public void count() {
		synchronized (this) {
			count++;
		}
	}
	
	public synchronized int getCount() {
		return count;
	}
	
	
}

public class CountingClient {

	public static void main(String[] args) throws InterruptedException {
		Counter c =new Counter();
		Thread t = new Thread(){     
			public void run(){
				for(int i=0;i<1000;i++) {
					c.count();
				}
			}
		 };
		 Thread t1 = new Thread(){     
				public void run(){
					for(int i=0;i<1000;i++) {
						c.count();
					}
				}
			 };
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println(c.getCount());
	}

}