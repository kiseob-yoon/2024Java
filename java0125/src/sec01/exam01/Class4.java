package sec01.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class4 {

	void method(String ename){
		String url = "jdbc:mysql://localhost:3306/firm"; 
		String id = "root"; 
		String pass = "mysql"; 
		String sql = "select * from emp where ename = '"+ ename+"'"; //''(홑따옴표 문자에 반드시 있어야함)
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+ "\t");
				System.out.print(rs.getString("ename")+ "\t");
				System.out.println(rs.getDouble("sal"));
			}
		}catch(Exception e){
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		Class4 cs = new Class4();
		cs.method("JONES");

	}
}
