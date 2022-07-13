package jdbc;
import java.sql.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String uname="hbstudent";
		String pass="hbstudent";
		String url="jdbc:mysql://localhost:3306/mysql_workspace";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Connection success.");
	}
}
