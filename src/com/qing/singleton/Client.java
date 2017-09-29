package com.qing.singleton;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingletonTest singleton=SingletonTest.getInstance();
	//	singleton.doTest();
		
		Singleton s=Singleton.getInstance();
		Singleton ss=Singleton.getInstance();
		s.doTest();
		ss.doTest();
	}

}
