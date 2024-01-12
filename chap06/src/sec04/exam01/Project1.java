package sec04.exam01;

import java.util.Scanner;

public class Project1{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankFunction bf1 = new BankFunction();
		while (bf1.run) {
			bf1.BankFunction();
		
			bf1.menuNum = Integer.parseInt(scanner.nextLine());
			switch (bf1.menuNum) {
			case 1:
				bf1.login(bf1.membershipStatus,bf1.loginStatus,bf1.scanner,bf1.memberName,bf1.memberSSN);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				bf1.run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}






