
import java.io.IOException;
import java.io.PrintWriter;
import P1.Connect;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Register extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession sess=req.getSession();
		String fname=(String)sess.getAttribute("fname");
		String uid=(String)sess.getAttribute("uid");
		String pno=req.getParameter("pno");
		String optional=req.getParameter("optional");
		String dob=req.getParameter("dob");
		String gen=req.getParameter("gen");
		Connect c1=new Connect();
		boolean b=c1.update_next(uid, pno, dob, gen);
		System.out.println(fname);
		System.out.println(uid);
		System.out.println(pno);
		System.out.println(optional);
		System.out.println(dob);
		System.out.println(gen);
		
		PrintWriter out=res.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table cellpadding=\"3>");
		out.println("<tr>\r\n"+"<td><h2><font size=\"3\" color=\"black\" style=\"font-family:arial;\">Your Account Is Successfully Register</font></h2></td>\r\n"+"</tr>");
		out.println("<tr>\r\n"+"<td><h3><font size=\"3\" color=\"red\" style=\"font-family:courier;\"><a href=\"login\" target=\"login\"><p>clich here for log in</p></a></font></h3></td>\r\n"+"</tr>");
		out.println("</head>");
		out.println("</body>");
		out.println("</table>");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
	
}
