package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
		
//		ArrayList<String> stringList = new ArrayList<>();
		
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) { //레코드를 넘겨주는 역할(next)
			System.out.print(rs.getInt("empno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.println(rs.getDouble("sal"));
			
		}

	}

}
