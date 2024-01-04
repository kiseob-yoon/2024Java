//package sec02.exam01;
//
//public class blog {
//
//	public static void main(String[] args) {
//		//타입 변환 문제
//		
//		//문제 1 컴파일 에러가 발생하는 것은?
//		byte byteValue = 10;
//		char charValue = 'A';
//		
//		1. int intValue = byteValue;
//		2. int intValue = charValue;
//		3. short shortValue = charValue; //char 타입의 양의 허용 범위가 short 타입보다 더 큼
//		4. double doubleValue = byteValue;
//		
//		//문제 2 강제 타입 변환 문제이다. 컴파일 에러가 발생하는 것은?
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		
//		1. double var = (double)intValue;
//		2. byte var = (byte)intValue; 
//		3. int var = (int)doubleValue;
//		4. char var = (char) strValue; //4번 문자열을 char타입으로 강제 타입 변환(캐스팅)할 수 없음
//		
//		//문제 3 연산식에서의 타입 변환이다. 컴파일 에러가 발생하는 것은?
//		byte byteValue = 10;
//		float floatValue = 2.5F;
//		double doubleValue = 2.5;
//		
//		1. byte result = byteValue + byteValue; // byteValue값이 정수형으로 작은타입인 byte타입에서 받을 수 없다.
//		2. int result = 5 + byteValue;
//		3. float result = 5 + floatValue;
//		4. double result = 5 + doubleValue;
//		
//		//문제 4 컴파일 에러가 발생하는 위치와 이유 설명
//		01 short s1 = 1;
//		02 short s2 = 2;
//		03 int i1 =3;
//		04 int i2 =4;
//		05 short result = s1 + s2; //s1과 s2변수가 정수형이므로 short는 이를 받을 수 없다.
//		06 int result = i1 +i2;
//		
//		//문제 5 알파벳 a의 유니코드는 97이고, b의 유니코드는 98이다. 따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로 다음과 같이 코드를 작성했다.
//		//실행결과가 b가 출력되어야 하는데, 컴파일 에러가 발생했다. 무엇이 문제이고 어떻게 수정하면 될까?
//		
//		char c1 = 'a';
//		char c2 = c1 +1; // 숫자 1이 정수로 char타입에서는 int형을 받을 수 없다. char c2 = (char) (c1+1);
//		System.out.println(c2);
//		
//		//문제 6
//		int x = 5;
//		int y = 2;
//		result = x / y; //result 앞에 int형 넣어주기, x,y가 모두 int형이니라서
//		System.out.println(result);
//		
//		//문제 7 출력되는 결과가 2.5나오게 하시오
//		int x = 5;
//		int y = 2;
//		double result = (double)x/y;
//		System.out.println(result);
//		
//		//문제 8 두 실수 덧셈하고 소숫점 버리기
//		double var1 =3.5;
//		double var2 =2.7;
//					
//		int result = (int)(var1 + var2);
//		System.out.println(result);
//		
//		//문제 9 var1부터 var4까지 연산수행하기. result 변수에 9가 저장되도록 하시오
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//
//		int result = (int)(var1+var2+var3+ (int)Double.parseDouble(var4));		
//		System.out.println(result);
//		
//		//문제 10 코드 실행했을떄 값 구하기
//		String str1 = 2 + 3 + ""; // 5
//		String str2 = 2 + "" + 3; // 23
//		String str3 = "" + 2 + 3; // 23
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		//문제 11 문자열을 기본 타입으로 변경하기
//		byte value = Byte.parseByte("10"); 
//		int value = Integer.parseInt("1000");
//		float value = Float.parseFloat("20.5");
//		double value = Double.parseDouble("3.14159");
//		
//		
//	}

}
