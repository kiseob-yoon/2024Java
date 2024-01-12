package sec01.exam01;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student(); //객체 생성
		//Student s1 = null stack변수를 생성 기본타입(주소 번지값)
		//s1 = new Student() 힙영역에 생성, ()들어가면 무조건 메소드
		
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

	}

}
// 순차적인 프로그래밍, 객체 지향 프로그래밍이 아니다
// API:남이 만들어놓은 라이브러리