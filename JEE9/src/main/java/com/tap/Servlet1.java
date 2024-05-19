package com.tap;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	 
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String passaword = req.getParameter("passoward");
		
		
		
		Cookie c1 = new Cookie("username",username);
		Cookie c2 = new Cookie("passoward",passaword);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		System.out.println("cookies are added success");
		
		resp.sendRedirect("callingServlet2");
		
		
	}

}
