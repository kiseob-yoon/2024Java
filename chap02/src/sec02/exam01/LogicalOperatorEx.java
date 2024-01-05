package sec02.exam01;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) { // &가 하나면 무조건 두 조건을 다 비교함
			System.out.println("대문자군요");
		}
		if((charCode>=97) && (charCode<=122)) { // &&는 둘 중하나가 만족하면 남은 조건문을 실행하지 않음
			System.out.println("소문자군요");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("대문자군요");
		}
		
		int value =6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}

}
