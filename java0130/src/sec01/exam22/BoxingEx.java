package sec01.exam22;

public class BoxingEx {

	public static void main(String[] args) {
		Integer num1 = new Integer(3);
		Integer num2 = new Integer(3);
		
		System.out.println(num1 == num2);//참조비교
		System.out.println(num1.equals(num2)); //값비교
		
		int x = 100; 
		String str = "가나다";
		//박싱
		Integer obj2 = Integer.valueOf("100");//문자열 "100"을 Integer객체로 바꾸는 박싱 예제이다.   
		Integer obj1 = 300; //정수값 300을 자동으로 Integer 객체로 박싱한다. 이는 오토박싱이다.
		System.out.println(obj1); 
		//언박싱
		int y = obj1.intValue(); //박싱한 obj1을 언박싱하여 int y에 가져옴
		System.out.println(y);
		int z = x + obj1; //x값과 언박싱한 obj1값을 더해서 int z에 가져옴
		System.out.println(z);
		
		System.out.println(x == obj2); //x(100)과 obj2를 Integer로 바꾼값(100)이 일치 true
		System.out.println(x != obj1); //x(100)과 obj1를 언박싱한 값(300)이 같지않으며 !연산로 true출력
	}

}
