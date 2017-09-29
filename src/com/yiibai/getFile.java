package com.yiibai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class getFile {
 
	public static void main(String[] args) {
		getFileUser();
	}
	//读取文件内容，并存入List
	public static void getFileUser(){
		File file=new File("F:\\user.txt");
		FileReader fReader = null;
		try {
			fReader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		BufferedReader reader=new BufferedReader(fReader);
		try {
			fReader=new FileReader(file);
			String a;
			while((a=reader.readLine())!=null){
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
