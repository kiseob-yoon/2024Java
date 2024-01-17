package sec03.exam02;

public abstract class Animal {
	String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //추상 메소드 선언 

}

//추상 메서드를 위해서 추상 클래스를 만들었다.
//추상 메서드는 몸통 {}가 있으면 오류다.
//추상 클래스는 추상 메서드를 담을 수 있다. 나머지는 일반 클래스와 다름이 없다.
