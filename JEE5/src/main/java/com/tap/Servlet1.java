package com.tap;

import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CallingServlet1")
public class Servlet1 extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un =req.getParameter("username");
		PrintWriter out =  resp.getWriter();
		out.print("hello "+un+" welcomr to home page (servlet1)\n");
		
		 RequestDispatcher rd = req.getRequestDispatcher("callingServlet2");
		 rd.include(req, resp);
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String un =req.getParameter("username");
//		PrintWriter out = resp.getWriter();
//		out.print("hello "+un+ " welcome to home page(doget)");
//		
//	}
//	
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String un =req.getParameter("username");
//		PrintWriter out = resp.getWriter();
//		out.print("hii "+un+ " welcome to home page(dopost)");
//		
//		
//	}
}
