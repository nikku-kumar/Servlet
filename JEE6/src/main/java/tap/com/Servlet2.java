package tap.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x = req.getParameter("x");
		String y=req.getParameter("y");
		
		int x1= Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		int product= x1*y1;
		
		int sum =(int)req.getAttribute("mysum");
		
		PrintWriter out = resp.getWriter();
		
		out.println("sum is =: "+sum);
		out.print("multiple  = : "+ product);
		
		
	}

}
