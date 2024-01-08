package chap05;

public class StackEx {

	public static void main(String[] args) {
		int age = 32; //기본 타입 변수에 값 저장
//		int [] intArray =null; //int형 배열에 null값->아직 객체 생성안됨
//		intArray[0] = 10; //참조할 값이 없어 NullPointerException 오류 발생
		
//		String str; //String은 기본 타입의 변수가 아니라 참조형 타입의 변수다. 그러나,초기값 설정하지않아 객체가 없음 
//		System.out.println(str.length()); //접근할 수 있는 참조값이 없어 NullPointerException 오류 발생
		
		String name1 = "신용권"; //힙 영역 생성되서 신용권이라는 값 저장
		String name2 = "신용권"; 
		System.out.println(name1 == name2); // "신용권"이라는 값을 비교하는 것이 아니다. new를 사용하여 객체를 생성하지 않고 같은 값이면 똑같은 메모리주소에 배치된다. 따라서 결과 true
		
		String name3 = new String("신용권"); 
		String name4 = new String("신용권");
		System.out.println(name3 == name4); //new를 써서 객체를 만들었을때는 각기 다른 메모리 주소로 배치되기 때문에 false
		
	}

}
