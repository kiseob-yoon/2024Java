package sec02.exam03;

public class dbWork{

public static void dbWork1(DataAccessObject dao){ //dbWork1 메소드는 인터페이스 구현객체를 매개변수로 받음
	dao.select(); //구현객체에 접근해서 메소드 호출
	dao.insert();
	dao.update();
	dao.delete();
}
	
	public static void main(String[] args) {
		dbWork1(new OracleDao()); //dbWork1 메소드 호출하고 오라클 객체 생성해서 인수값을 넘겨줌. 4줄의 구문 출력
		dbWork1(new MysqlDao()); //dbWork1 메소드 호출하고 sql 객체 생성해서 인수값을 넘겨줌. 4줄의 구문 출력
	}

}

//1. dbWork1 메서드 호출 및 오라클 혹은 sql 객체생성
//2. 구현객체를 인수값으로 넘겨줌
//3. 매개변수갑으로 받은 구현객체에 접근하여 4개의 메소드를 호출한다.