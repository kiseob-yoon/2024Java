package chap08.prob3;

class Cat implements Soundable{ //인터페이스 구현 
	@Override
	public String sound() {
		return "야옹";
	}
	
}

class Dog implements Soundable{ //인터페이스 구현

	@Override
	public String sound() { 
		return "멍멍";
	}
	
}

public class SoundableEx { 

	public static void printSound(Soundable soundable) { //2. 메소드 정의 매개변수로 인터페이스 타입의 구현객체를 받아옴
		System.out.println(soundable.sound()); //3. 구현객체의 소리를 출력하는데 인터페이스에서 오버라이딩이 된 자식 객체를 출력하게 된다.
	}
	
	public static void main(String[] args) { // 메인 메소드
		printSound(new Cat()); //1. 메소드를 호출하고 새로운 인스턴스를 생성한다. 
		printSound(new Dog());
	}

}

