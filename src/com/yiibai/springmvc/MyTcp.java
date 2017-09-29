package com.yiibai.springmvc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class MyTcp {  
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	
	void getserver(){
		try {
			server=new ServerSocket(8998);
			server.setSoTimeout(10000);
			System.out.println("服务器套接字已经创建成功");
			while(true){
				System.out.println("等待客户机的链接");
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				try {
					getClientMessage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    private void getClientMessage() throws Exception {
    	try{
    		while(true){
    			System.out.println("客户机:"+reader.readLine());
    		}
    	}catch (Exception e) {
			e.printStackTrace();
		}
		if(reader!=null){
			reader.close();
		}
		if(socket!=null){
			socket.close();
		}
	}
	public static void main(String[] args) throws Exception {
    	MyTcp tcp=new MyTcp();
    	tcp.getserver();
    }
}