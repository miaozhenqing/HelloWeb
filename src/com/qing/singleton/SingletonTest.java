package com.qing.singleton;

public class SingletonTest {
	private static SingletonTest instance=new SingletonTest();
	private SingletonTest(){}
	public static SingletonTest getInstance(){
		return instance;
	}
	//普通方法
	public void doTest(){
		System.out.println("this is a test method for SingletonTest");
	}
}
