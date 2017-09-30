package com.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//git test   git test aabbbbbb
//Test on web
//local  test
public class Client {

	public static void main(String[] args) {
		System.out.println(2<<8);
	}
	//equlas 测试
	public static void testEquals(){
		Client c=new Client();
		System.out.println(c.equals("test"));
		System.out.println("test".equals(c));
	}
	//ArrayList 删除元素
	public static void ListTest(){
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("22");
		list.add("333");
		list.add("4");
		System.out.println(list);
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String value=it.next();
			it.remove();
		}
		System.out.println(list);
	}
	//float  double 运算
	public static double testDouble(float a,double b){
		
		return a/2+b;
	}
	// Arrays.asList()
	public static void asList() {
		int[] a = { 1, 2, 3, 4, 8, 10, 22, 12, 214, 23 };
		String[] b = { "a", "b", "c" };
		Integer[] c = { 1, 2, 3, 4, 8, 10, 22, 12, 214, 23 };
		System.out.println(Arrays.asList(a));
		System.out.println(Arrays.asList(b));
		System.out.println(Arrays.asList(c));
	}

	// 去掉字符串多余空格,只留一个
	public static void moveSpace() {
		String a = "Tom   ,welcome   come to shanghai";
		System.out.println(a);
		String aa = a.replaceAll("\\s{1,}", " ");
		System.out.println(aa);
	}

	// 反向输出字符串
	public static void printStr() {
		String str = "hello my name is tom how are you";
		String[] res = str.split(" ");
		String result = "";
		for (int i = res.length - 1; i >= 0; i--) {
			result += res[i] + " ";
		}
		System.out.println(result);// you are how tom is name my hello
	}

}
