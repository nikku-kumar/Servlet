package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url="jdbc:mysql://localhost:3306/jee4";
		String username="root";
		String password="root";
		Connection connection ;
		String sql="INSERT INTO `members` (`name`,`lastname`,`emailid`) VALUES (?,?,?)";
		PreparedStatement pstmt;
		PrintWriter out;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			 connection = DriverManager.getConnection(url,username,password);
			System.out.println("connection is succes");
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1,req.getParameter("name"));
			pstmt.setString(2,req.getParameter("lastname"));
			pstmt.setString(3,req.getParameter("emailid"));
			int n =pstmt.executeUpdate();
		    out = resp.getWriter();
			if(n>0) {
				out.print("registraion success ! ");
			}else {
				out.print("registraion failed ! ");
			}
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
