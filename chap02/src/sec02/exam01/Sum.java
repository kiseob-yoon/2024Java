package sec02.exam01;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in); //객체 생성
	 System.out.print("첫번째 수:");
	 String strNum1 = scanner.nextLine();
	 System.out.print("두번째 수:");
	 String strNum2 = scanner.nextLine();
	 int num1 = Integer.parseInt(strNum1);
	 int num2 = Integer.parseInt(strNum2);
	 
	 sum(num1,num2); //메서드 호출(객체 변수 인자값으로 넘김)
	 multi(num1,num2);

	}
	public static void sum(int num1, int num2) { //매개변수에서 인자값으로 받은 scanner 
		 int result = num1 + num2;
		 System.out.println("덧셈 결과:" + result);
	}
	public static void multi(int num1, int num2) {
		 int result = num1  num2;
		 System.out.println("곱셈 결과:" + result);
	}
	
	}
	



