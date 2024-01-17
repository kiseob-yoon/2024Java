package sec05.exam02;

public class Person {
	final static public double PI1 = 3.141592;
	public static final double PI = 3.141592; //상수
	final String name; //final 초기값 안주면 생성자로 받는 것 한번만 허용 
	
	public Person(String name) { 
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		Person person = new Person("석봉");
//		person.name = "홍길동";
		
		final int x; // 한번만 준 값이 고정
		x = 300; 
//		x = 200;
		
		
	}

}
