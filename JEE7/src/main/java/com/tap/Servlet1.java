package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	static int count =3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String password  = req.getParameter("passoward");
		
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html");
		if("son2023".equals(password)) {
			out.println("WELCOME TO HOME PAGE ");
		}else if(count>0){
			
			out.print("INVALID PASSSWORD , "+count+"  ATTEMPT LEFT ");
			count--;
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
		else {
			out.println("ATTEMPT OVER contact admin");
		}
	}

}
