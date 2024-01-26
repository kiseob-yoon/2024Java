package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //로딩은 메모리에 올라갔냐는 것을 의미함
		} catch (ClassNotFoundException e1) {
			System.out.println("클래스가 존재하지 않음!"); //실행중인 프로그램을 멈추지 않기 위해서 예외 처리를 해준다.
			System.exit(0);
//			e1.printStackTrace(); //오류 난 내용을 보여줌
		} finally {
			System.out.println("한번은 실행");
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
