package com.yiibai.springmvc;

public class test16 {

	/*************************************
	 * @param args
	 * 算法思想：分别求每一位的字符，从后向前求
	 ************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test16 t = new test16();
		System.out.println(t.getColumnLable(25));
	}

	String getColumnLable(int n) {
		
		String tmp = "";
			// 按位找
			int count = 1;
			while (((int) (n / Math.pow(26, count-1)) > 0)) {
				int w3 = ((int) (n % Math.pow(26, count)) / (int) Math.pow(26, count - 1));
				char c = (char) (w3 + 65);
				tmp = c + tmp;
				count++;
			}
		return tmp;
	}
}
