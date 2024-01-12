package sec03.exam02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10; //타입 byte
		int intValue = byteValue; //타입 byte->int
		System.out.println("intValue " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);

	}

}
