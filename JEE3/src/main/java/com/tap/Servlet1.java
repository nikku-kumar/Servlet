package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String u =req.getParameter("username");
		String pw=req.getParameter("password");
		
		PrintWriter ps = resp.getWriter();
		ps.print("Hello "+u+" welcome to home page");
		
	}
	
	
	

}
