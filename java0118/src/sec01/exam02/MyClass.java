package sec01.exam02;

public class MyClass implements InterTest{
	@Override
	public void test() {
		
	}
	@Override
	public void test1() {
		System.out.println("테스트");
	}
	
	public static void main(String[] args) {
		InterTest.test5(); //인터페이스에 메소드 호출
		InterTest it = new MyClass(); //인터페이스 InterTest의 구현 클래스인 MyClass객체를 생성
		it.test1(); //오버라이딩 결과 출력
	}
}
