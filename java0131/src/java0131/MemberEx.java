package java0131;

public class MemberEx {

	public static void main(String[] args) {
		Class clazz = Member.class; //member클래스의 메타데이터를 다루기 위한 Class 객체를 생성하는 코드
		System.out.println(clazz.getName());
		
		Member member = new Member("blue", "이파란");
		System.out.println(member); //member객체의 요소가 문자열로 toString 자동으로 호출
	}

}
