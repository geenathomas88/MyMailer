import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminInbox extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println("AdminInbox Servlet invoked");
		PrintWriter pw = resp.getWriter();
		
		pw.write("<table border=1, style='background-color: Khaki ;text-align: left;border: 1px solid blue; width:100% ;border-collapse: collapse'  >");
		pw.write("<tr><th>Number.</th><th>Name</td><th>Date</th></tr>");
		pw.write("<tr><td>1.</td><td>Admin System SetUp</td><td>8-Aug-2015</td></tr>");
		pw.write("<tr><td>2.</td><td>Welcome AdminMail</td><td>7-Aug-2015</td></tr>");
		pw.write("</table>");
		pw.close();
	}
}
