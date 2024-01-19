package sec02.exam03;

public class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("sql select다");
	}

	@Override
	public void insert() {
		System.out.println("sql insert다");
		
	}

	@Override
	public void update() {
		System.out.println("sql update다");
		
	}

	@Override
	public void delete() {
		System.out.println("sql delete다");
		
	}

}
