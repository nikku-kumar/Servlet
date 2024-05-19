package tap.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		
		int x1 =Integer.parseInt(x);
		int y1 =Integer.parseInt(y);
		
		int sum =x1+y1;
		req.setAttribute("mysum", sum);
		
//		PrintWriter out = resp.getWriter();
//		out.println("sum = : " + sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("callingServlet2");
		rd.include(req, resp);
		
	}

}
