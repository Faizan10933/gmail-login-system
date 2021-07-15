import java.io.IOException;
import java.io.PrintWriter;
import P1.Connect;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class check extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uid=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		Connect c1=new Connect();
		boolean b=c1.checkUser(uid,pwd);
		System.out.println(b);
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
}