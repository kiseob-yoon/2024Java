package sec02.exam03;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("오라클 select다");
	}

	@Override
	public void insert() {
		System.out.println("오라클 insert다");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 update다");
		
	}

	@Override
	public void delete() {
		System.out.println("오라클 delete다");
		
	}
	

}
