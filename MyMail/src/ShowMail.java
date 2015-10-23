import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowMail extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName = req.getParameter("uName");
		
		if(uName.equals("Admin")){
			
		}
		else if(uName.equals("Geena")){
			
		}
	}
}
