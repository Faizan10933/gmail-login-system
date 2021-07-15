import java.io.IOException;
import java.io.PrintWriter;
import P1.Connect;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Page2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession sess=req.getSession();
		String fname=(String)sess.getAttribute("fname");
		String uid=(String)sess.getAttribute("uid");
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Gmail</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form name=\"f1\" id=\"f1\" method=\"post\" action=\"next3\"");
		out.println("<table border=\"0\" bordercolor=\"black\" cellspacing=\"0\" cellpadding=\"5\">");
		out.println("<tr>");
		out.println("<td colspan=\"2\">");
		out.println("<H1><B><FONT COLOR=BLUE>G</FONT><FONT COLOR=RED>o</FONT><FONT COLOR=YELLOW>o</FONT><FONT COLOR=BLUE>g</FONT><FONT COLOR=GREEN>l</FONT><FONT COLOR=RED>e</FONT></B></H1>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\">");
		out.println("<h2>"+fname+" Welcome to Google</h1>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<h1>"+uid+"</h1>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><h2>Phone Number</h2></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type=\"text\" name=\"pno\" required></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\"><h3>We'll use your number for account security.It won't be visible to others.</h3></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<h2>Recovery email address(optional)</h2></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type=\"text\" name=\"optional\" size=\"40\" required></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\">");
		out.println("<h3>We'll use it to keep your account secure</h3>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\"><input type=\"date\" name=\"dob\">");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\">");
		out.println("<h3>Your birthday</h3>");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan=\"2\">Gender : <input type=\"radio\" name=\"gen\" value=\"male\">Male <input type=\"radio\" name=\"gen\" value=\"female\">Female");
		out.println("</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>\r\n<td><font size=\"4\"><a href=\"Reason\">Why we ask for this information</a></font></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><input type=\"submit\" name=\"Register\" value=\"Next\"></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
}
