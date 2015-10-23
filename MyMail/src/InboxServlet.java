import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InboxServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inbox Servlet invoked");
		String uName = req.getParameter("uName");
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.write("<h2 style='color:blue' align= center>Welcome to MyMail</h2>");
		pw.write("<h4 align = right>You are logged in as "+uName+"</h4>");
		pw.write("Viewing Inbox");
		
		if(uName.equals("Admin")){
			RequestDispatcher rd = req.getRequestDispatcher("adminmail.html");
			rd.include(req, resp);
		}
		else if(uName.equals("Geena")){
			RequestDispatcher rd = req.getRequestDispatcher("userinbox");
			rd.include(req, resp);
		}
		pw.close();
	}
}
