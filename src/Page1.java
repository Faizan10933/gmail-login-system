import java.io.IOException;
import java.io.PrintWriter;
import P1.Connect;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Page1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession sess=req.getSession();
		Connect c1=new Connect();
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		sess.setAttribute("fname", fname);
		sess.setAttribute("uid", uname);
		boolean b=c1.save_records(fname, lname, uname, pwd);
		System.out.println(b);
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>GMAIL</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table cellpadding=\"5\">");
		out.println("<tr>");
		out.println("<td>");
		out.println("<H1><B><FONT COLOR=BLUE>G</FONT><FONT COLOR=RED>o</FONT><FONT COLOR=YELLOW>o</FONT><FONT COLOR=BLUE>g</FONT><FONT COLOR=GREEN>l</FONT><FONT COLOR=RED>e</FONT></B></H1>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<h1>"+fname+" ,Welcome to Google"+"</h1>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>\r\n" + 
				"		<td>\r\n" + 
				"		<a href=\"next2\">click here to continue</a>\r\n" + 
				"		</td>\r\n" + 
				"		<td>");
		out.println("</body>");
		out.println("</html>");
		
		

		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
}
