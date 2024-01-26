package sec01.exam01;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println(obj1.hashCode()); //해시코드는 객체를 식별하는 하나의 정수값이다.
		System.out.println(obj2.hashCode()); //해시코드가 같고 equals값이 같으면 동등 객체이다.
		System.out.println(obj3.hashCode());
		
		//obj1과 obj2를 객체생성할 때 같은 문자열인 "blue"를 가진 Member 객체로 초기화되었다.
		//hashCode메서드는 객체의 내용이 같다면 동일한 해시 코드를 반환한다.
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}

	}

}
