package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/firm"; //연결하려는 MySQL 데이터베이스의 URL을 지정한다. firm은 데이터베이스의 이름
		String id = "root"; //사용자 id
		String pass = "mysql"; //비밀번호
		Scanner scan = new Scanner(System.in);
		System.out.print("부서번호를 입력하세요:");
		int deptno = Integer.parseInt(scan.nextLine());
		System.out.print("부서이름을 입력하세요:");
		String dname = scan.nextLine();
		System.out.print("부서위치를 입력하세요:");
		String loc = scan.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //MySQL 데이터베이스를 연결하기 위한 MySQL JDBC 드라이버를 로드한다.
		Connection conn = DriverManager.getConnection(url, id, pass); //이 라인은 주어진 URL, 사용자 이름 및 비밀번호를 사용하여 MySQL 데이터베이스에 연결한다.
		Statement stmt = conn.createStatement(); //Connection 인터페이스에 정의된 메서드 중 하나로 Statement 객체를 생성한다
		String sql = "insert into dept(deptno, dname, loc) values ("+deptno+", '"+dname+"', '"+loc+"')"; //SQL insert문
//		System.out.println(sql);
//		int result = stmt.executeUpdate(sql); //SQL문을 실행하고 영향을 받은 행의 수를 result 변수에 저장한다.
//		if(result == 1) {
//			System.out.println("입력성공!");
//		} else {
//			System.out.println("입력실패!");
//		}
	}

}
