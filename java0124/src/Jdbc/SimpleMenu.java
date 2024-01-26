package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleMenu{

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";
    static Scanner scan = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) { 
            boolean exit = false;

            while (!exit) {
                System.out.println("1. 데이터 보기");
                System.out.println("2. 데이터 삽입");
                System.out.println("3. 종료");
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
                        exit = true;
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
			Statement stmt = connection.createStatement();
			String sql = "select deptno,dname,loc from dept";
			ResultSet result = stmt.executeQuery(sql);
			
			while(result.next()) { //레코드를 넘겨주는 역할(next)
				int deptno = result.getInt("deptno");
				String dname = result.getString("dname");
				String loc = result.getString("loc");
				
				System.out.println(deptno + ", " + dname + ", " + loc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    private static void insertData(Connection connection) {
    	try {
			Statement stmt = connection.createStatement();
			System.out.print("부서번호를 입력하세요:");
			int deptno = Integer.parseInt(scan.nextLine());
			System.out.print("부서이름을 입력하세요:");
			String dname = scan.nextLine();
			System.out.print("부서위치를 입력하세요:");
			String loc = scan.nextLine();
			String sql = "insert into dept(deptno, dname, loc) values ("+deptno+", '"+dname+"', '"+loc+"')";
			int result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}

