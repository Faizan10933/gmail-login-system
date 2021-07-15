import java.io.IOException;
import java.io.PrintWriter;
import P1.Connect;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class login extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession sess=req.getSession();
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form name=\"f1\" id=\"f1\" method=\"post\" action=\"check\">");
		out.println("<table border=\"0\" bordercolor=\"black\" cellspacing=\"0\" cellpadding=\"5\">");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<h2>User Id :</h2>");
		out.println("</td>");
		
		out.println("<td><input type=\"text\" name=\"uname\" required>@gmail.com</td>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println("<h2>Password :</h2>");
		out.println("</td>");
		
		out.println("<td><input type=\"password\" name=\"pwd\" required></td></tr>");
		out.println("</table>");
		
		out.println("</td>");
		
		out.println("<td><input type=\"submit\" name=\"Login\" value=\"Login\"></td>");
		
		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
}