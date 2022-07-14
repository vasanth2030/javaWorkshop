package jdbc;
import java.sql.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String uname="hbstudent";
		String pass="hbstudent";
		String url="jdbc:mysql://localhost:3306/mysql_workspace";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st= con.createStatement();
		
		//read
//		ResultSet rs= st.executeQuery("select * from student where student_id>2");
//		while(rs.next())
//		{
//			System.out.print(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "
//					+rs.getString(4));
//			System.out.println();
//		}
		
		//insert
//		int n = st.executeUpdate("insert into student values (7, 'Rohan',21, 'rohan@gmail.com')");
//		System.out.println(n+" rows affected");

		//update
//		int n = st.executeUpdate("update student set age=25 where student_id>3");
//		System.out.println(n+" rows affected");

		int n = st.executeUpdate("delete from student where student_id=7");
		System.out.println(n+" rows affected");

		System.out.println("Connection success.");
	}
}
