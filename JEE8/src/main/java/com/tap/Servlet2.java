package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    HttpSession	session = req.getSession();
	    String name = (String)session.getAttribute("username");
		PrintWriter out = resp.getWriter();
		out.print("hey  "+name+"    attempt over contact admin");
	}

}
