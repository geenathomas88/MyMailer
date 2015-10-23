import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login Servlet invoked");
		String uName = req.getParameter("uName");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		if(uName.equals("Admin") && password.equals("Admin" ) || uName.equals("Geena") && password.equals("Geena" )){
			RequestDispatcher rd = req.getRequestDispatcher("inbox");
			rd.forward(req, resp);
		}else{
			pw.write("<h4 style= 'color:red'>Sorry!! Incorrect User Name/ Password. Try Again.</h4>");
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req,resp);
		}
			
	}
}
