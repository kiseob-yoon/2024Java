package proxy;

public class Client {

	public static void main(String[] args) {
		ISubject sub = new Proxy(new RealSubject()); //프록시를 생성하고 실제 주체 객체를 전달 프록시는 ISubject의 구현 객체로 ISubject타입으로 취급되어 인터페이스의 메서드를 호출할 수 있다. 
		sub.action(); //프록시를 통해 실제 객체의 메소드를 호출한다.
		
	}

}
