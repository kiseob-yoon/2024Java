package sec03.exam01;

public class SmartPhone2 extends Phone{
//	System.out.println(x); //실행문은 메소드 안에 있어야 한다.
	int y;
	public SmartPhone2(int x, int y) { //생성자
		super(x); //부모의 생성자 호출
		this.y = y;
	}
	
	public void printX() {
		System.out.println(x); 
	}

	@Override
	public String ring(int tel) { 
		// TODO Auto-generated method stub
		return null;
	}
	
}
