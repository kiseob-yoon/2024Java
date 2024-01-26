package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}

public class JdbcArrayEx {
	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null;
		Connection conn = null;
//		String sql = "select * from dept"; 
		String sql = "select deptno, dname, loc from dept"; //이 코드를 기준으로 stament가 쿼리를 보내고 ResultSet에 저장. 그래서 여기와 출력문이 잘맞아떨어져야 에러 안남

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				int deptno = rs.getInt(1);
				int deptno = rs.getInt("deptno"); //db에 처음 입력되었던 값의 순서를 기준으로 출력함
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				String str = deptno+", " + dname + ", " + loc;
//				System.out.println(deptno+", " + dname + ", " + loc);
				Dept dept = new Dept(deptno, dname, loc); //클래스로 객체 생성해서 생성자로 값을 넘겨준다.
				list.add(dept); //값을 담은 객체를 list에 add(추가)해준다.
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Dept dept : list) {
			System.out.println(dept.getDeptno()+ "\t" + dept.getDname()+ "\t" + dept.getLoc());
			
		}
	
		

	}

}
