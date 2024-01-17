package Example;

public class Child extends Parent{
	private String name;
	
	public Child() { //2. 객체 생성으로 접근
		this("홍길동"); //3. 매개변수 있는 생성자로 접근
		System.out.println("Child()call"); //13.매개변수 있는 생성자 끝난 후 다시 올라와서 출력 후 끝
	}
	public Child(String name) { //4. 홍길동 값 받음
		super(); //5. 슈퍼발견 부모 클래스로 올라감
		this.name = name;  //11. 홍길동 값 필드에 대입
		System.out.println("Child(String name) call"); //12.출력
	}
}
