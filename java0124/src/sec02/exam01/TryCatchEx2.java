package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx2 {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException e) { //
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// try catch에서 상위 클래스가 하위 클래스보다 앞으로 나오면 안된다.

	}

}
