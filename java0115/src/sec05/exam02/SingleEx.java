package sec05.exam02;

public class SingleEx {

	public static void main(String[] args) {
//		Singleton sing1 = new Singleton();
		Singleton sing2 = Singleton.getInstance();
		Singleton sing3 = Singleton.getInstance();
		
		if(sing2 == sing3) {
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");
		}
		
		if(sing2.equals(sing3)) {
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");
		}
		
		//private으로 새로운 객체 생성을 막고 static으로 전역에서 사용할 수 있게 하는 유일한 객체를 생성한다.
		//그 객체를 활용하려면 getInstacne()메서드(?)로 사용할 수 있다.
		
		//싱글턴은 객체를 새로 생성하는 개념이 아니고, getInstance 객체를 사용할 수 있다

	}

}
