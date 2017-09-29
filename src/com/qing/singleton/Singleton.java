package com.qing.singleton;

public class Singleton {  
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
    //普通方法
  	public void doTest(){
  		System.out.println("this is a test method for SingletonTest");
  	}
}
