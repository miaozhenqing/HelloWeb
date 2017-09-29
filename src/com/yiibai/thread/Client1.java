package com.yiibai.thread;

public class Client1 extends Thread{
	int num=10;
	Thread client2=new Client2();
	public void run(){
		while(num>0){
			System.out.print("a ");
			num--;
			
		}
	}
	public static void main(String[] args) {
		Thread client1=new Client1();
		client1.start();
	}

}
class Client2 extends Thread{
	int num=10;
	public void run(){
		while(num>0){
			System.out.print("b ");
			num--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}