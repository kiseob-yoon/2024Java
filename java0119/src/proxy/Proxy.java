package proxy;

public class Proxy implements ISubject{
	
	private RealSubject realSubject; //실제 주체 객체를 참조하는 멤버변수로써, 프록시 객체가 생성될 때 외부에서 주입되어 실제 추제 객체를 관리한다.
	//다른 클래스의 객체 생성해서 받음
	
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void action() { //ISubject 인터페이스 재정의
		System.out.println("로깅.................");
		System.out.println("프록시 객체 실행");
		realSubject.action(); //실행 객체에 접근하여 action 메소드 호출
		System.out.println("로깅.................");
	}
}

//프록시는 실제 객체의 대리자를 통해 간접적으로 접근함으로써 추가적인 기능을 제공하거나, 복잡한 작업을 처리할 수 있게 해주는 디자인 패턴이다.
//프록시 객체가 클라이언트로부터 주체 객체를 받아들이고, 이를 통해 프록시 패턴을 구현한다.
//Client 클래스에서 Proxy 객체를 생성할 때 생성자를 통해 RealSubject 객체를 주입하게 된다.
//따라서, proxy클래스는 RealSubject 객체에 대한 접근을 갖고 있고 Client클래스는 proxy 객체를 통해 RealSubject객체의 메서드를 호출할 수 있게 되었다.
