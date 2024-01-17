package java0116;

public class Student extends People{
	String hakbun;

	public Student(String name, String hakbun) {
		super(name); // 부모의 생성자 호출 (여기서는 기본생성자 호출)//부모가 생성자를 만들면 자식이 그 중에 하나를 호출해야한다.
		//그러나, 만약 부모가 생성자가 없으면 super를 생략해도 된다.
		//부모의 생성자를 먼저 만든다는 것은 부모를 먼저 만든다는 것이다. 그래서 super는 첫줄에만 사용할 수 있다.
		this.hakbun = hakbun;
	}

	@Override //재정의의 행위를 실수하지 않고 개발하기 위함. 즉,개발자의 실수를 줄여주기 위함
	void method1() {
		System.out.println();
		super.method1(); //super(부모)생략가능  
	}
	
	
}
