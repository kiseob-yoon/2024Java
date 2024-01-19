package proxy;

public class RealSubject implements ISubject{
	@Override
	public void action() {
		System.out.println("실제 객체 실행");
	}
	
}

//인터페이스를 구현하는 구현클래스 
