package sec01.exam01;

public class ObjEx {

	public static void main(String[] args) {
		String str = new String("가나다"); //String은 Object를 이미 재정의해서 문자열이 같으면 같게 만들어둠
		String str1 = new String("가나다");
		System.out.println(str.equals(str1)); //==(객체의 주소값 비교).equals는 값 비교

		Object object1 = new Object();
		Object object2 = new Object();

		boolean result = object1.equals(object2); 
		System.out.println(result);

		boolean result2 = (object1 == object2); //객체의 주소값 비교 false
		System.out.println(result2);
	}

}
