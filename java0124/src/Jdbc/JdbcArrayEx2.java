package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp{
	int empno;
	String ename;
	String job;
	Double sal;
	
	public Emp(int empno, String ename, String job, Double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	
}

public class JdbcArrayEx2 {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null;
		Connection conn = null;
		String sql = "select empno,ename,job,sal from emp"; 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int empno = rs.getInt("empno"); //db에 처음 입력되었던 값의 순서를 기준으로 출력함
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Double sal = rs.getDouble("sal");
				
				String str = empno+", " + ename + ", " + job + ", " + sal;
				Emp emp = new Emp(empno, ename, job, sal); //클래스로 객체 생성해서 생성자로 값을 넘겨준다.
				list.add(emp); //값을 담은 객체를 list에 add(추가)해준다.
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Emp emp : list) {
			System.out.println(emp.getEmpno()+ "\t" + emp.getEname()+ "\t" + emp.getJob()+ "\t" + emp.getSal());
			
		}
	
		

	}

}
