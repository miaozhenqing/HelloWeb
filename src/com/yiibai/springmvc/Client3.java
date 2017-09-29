package com.yiibai.springmvc;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client3 {
	
	public static void main(String[] args) {
		InetAddress ip;
		try {
			ip=InetAddress.getLocalHost();
			String hostName=ip.getHostName();
			System.out.println(hostName);
			String hostIp=ip.getHostAddress();
			System.out.println(hostIp);
			System.out.println(ip.getAddress()[1]);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
