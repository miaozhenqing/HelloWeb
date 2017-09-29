package com.qing.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		try {
			PrintWriter out=response.getWriter();
			out.print("adjaldfjalksfjdsajsai");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
