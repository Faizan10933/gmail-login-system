package P1;
import java.sql.*;
public class Connect {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			//step2 create  the connection object  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");  
			System.out.println("Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean save_records(String fname,String lname,String uname,String pwd)
	{
		boolean b=false;
		try {
			String sql="INSERT INTO tbl_users(fname,lname,uname,pwd)VALUES(?,?,?,?)";
			ps=con.prepareStatement(sql);			
			ps.setString(1, fname);
			ps.setString(2,lname);
			ps.setString(3,uname);
			ps.setString(4,pwd);
			int n=ps.executeUpdate();
			if(n>0)
				b=true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	public boolean update_next(String uid,String pno,String dob,String gen)
	{
		boolean b=false;
		try {
			String sql="UPDATE tbl_users SET contact_no=?,dob=?,gender=? WHERE uname=?";
			ps=con.prepareStatement(sql);			
			ps.setString(1, pno);
			ps.setString(2,dob);
			ps.setString(3,gen);
			ps.setString(4,uid);
			int n=ps.executeUpdate();
			if(n>0)
				b=true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	public boolean checkUser(String uname,String pwd)
	{
		boolean b=false;
		try {
			String sql="select fname from tbl_users WHERE uname=? and pwd=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, pwd);
			rs=ps.executeQuery();
			if(rs.next())
				b=true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	
	
}
