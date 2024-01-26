package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {
	private static final String URL = "jdbc:mysql://localhost:3306/firm";
	private static final String ID = "root";
	private static final String PASS = "mysql";
	static Scanner scan = new Scanner(System.in);
	static Connection connection = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String sql = "select * from emp";

	public static void main(String[] args) {

		
		boolean exit = false;
		try {
			connection = DriverManager.getConnection(URL, ID, PASS);
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 데이터 조회");
				System.out.println("4. 데이터 수정");
				System.out.println("5. 데이터 삭제");
				System.out.println("6. 종료");
				System.out.print("선택하세요: ");

				String choice = scan.nextLine();

				switch (choice) {
				case "1":
					viewData(connection);
					break;
				case "2":
					insertData(connection);
					break;
				case "3":
					searchData(connection);
					break;
				case "4":
					updateData(connection);
					break;
				case "5":
					deleteData(connection);
					break;
				case "6":
					exit = true;
					System.out.println("프로그램이 종료됩니다.");
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void viewData(Connection connection) {
		try {
			stmt = connection.createStatement();
			sql = "select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp";
			rs = stmt.executeQuery(sql);
			while(rs.next()) { //레코드를 넘겨주는 역할(next)
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				Double sal = rs.getDouble("sal");
				Double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				
				System.out.println(empno + ", " + ename + ", " + job + ", " + mgr + ", " + hiredate + ", " + sal + ", " + comm + ", " + deptno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertData(Connection connection) {
    	try {
			stmt = connection.createStatement();
			System.out.print("사원번호:");
			int empno = Integer.parseInt(scan.nextLine());
			System.out.print("사원이름:");
			String ename = scan.nextLine();
			System.out.print("직업:");
			String job = scan.nextLine();
			System.out.print("mgr:");
			int mgr = Integer.parseInt(scan.nextLine());
			System.out.print("입사일:");
			String hiredate = scan.nextLine(); 
			System.out.print("연봉:");
			Double sal = Double.parseDouble(scan.nextLine());
			System.out.print("인센티브:");
			Double comm = Double.parseDouble(scan.nextLine());
			System.out.print("부서번호:");
			int deptno = Integer.parseInt(scan.nextLine());
			
			String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values ("+empno+", '"+ename+"', '"+job+"', "+mgr+", '"+hiredate+"', "+sal+","+comm+","+deptno +")";
			int result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    		
	}
	
	private static void searchData(Connection connection) {
		try {
			stmt = connection.createStatement();
			System.out.println("조회할 정보를 입력하세요");
			String empno = scan.nextLine();
			sql = String.format("select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where ename = '%s'", empno);
            try(ResultSet rs =stmt.executeQuery(sql)){
			while (rs.next()) {
                empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                java.sql.Date hiredate = rs.getDate("hiredate");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");
                int deptno = rs.getInt("deptno");
			
			System.out.println(empno + ", " + ename + ", " + job + ", " + mgr + ", " + hiredate + ", " + sal + ", " + comm + ", " + deptno);
			}
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	private static void updateData(Connection connection) {
		try {
			stmt = connection.createStatement();
			System.out.println("업데이트 정보를 입력하세요(사번)");
			System.out.print("사원번호:");
			int empno = Integer.parseInt(scan.nextLine());
			System.out.print("직업:");
			String job = scan.nextLine();
			System.out.print("mgr:");
			int mgr = Integer.parseInt(scan.nextLine());
			System.out.print("연봉:");
			Double sal = Double.parseDouble(scan.nextLine());
			System.out.print("인센티브:");
			Double comm = Double.parseDouble(scan.nextLine());
			System.out.print("부서번호:");
			int deptno = Integer.parseInt(scan.nextLine());

			sql = "update emp set job = '"+job+"', mgr = "+mgr+", sal = "+ sal +",comm ="+comm+",deptno = "+deptno+" where empno = " + empno;
			int result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteData(Connection connection) {
		try {
			stmt = connection.createStatement();
			System.out.println("삭제할 사원번호를 입력하세요");
			System.out.print("사원번호:");
			int empno = Integer.parseInt(scan.nextLine());
			
			String sql = "delete from emp where empno = " + empno;
			int result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
