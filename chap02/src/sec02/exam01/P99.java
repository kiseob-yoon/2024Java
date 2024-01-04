package sec02.exam01;

import java.util.Scanner;

public class P99 {

	public static void main(String[] args) {
		//Scanner 사용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드 작성하시오
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		int birthnumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String callnumber = scanner.nextLine();
		
		System.out.println("종료");
		

	}

}
