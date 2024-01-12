package sec04.exam01;

import java.util.Scanner;

public class BankFunction {
	
	boolean run = true;
	int menuNum = 0;
	String memberName = "";
	String memberSSN = "";
	String memberTel = "";
	int balance = 0;
	boolean loginStatus = false; // 로그인 여부
	boolean membershipStatus = false; // 회원가입 여부
	Scanner scanner = new Scanner(System.in);
	boolean run2 = false;
	
	void BankFunction(){
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택> ");
	}
	
		int login(boolean membershipStatus,boolean loginStatus,Scanner scanner,String memberName,
			String memberSSN) {
		
		int status = 0;
		if (!membershipStatus) {
			status = 1;
			System.out.println("회원 가입을 하시기 바랍니다.");
			return status;
		}
		if (loginStatus) {// 로그인 여부 확인
			status = 2;
			System.out.println("이미 로그인 상태입니다.");
			return status;
		}
		System.out.print("아이디:");  //출력문
		String name = scanner.nextLine(); // name 변수의 값 입력
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();//패스워드입력
		if (name.equals(memberName)) {
			if (strPassword.equals(memberSSN)) {
				status = 3;
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		return status;
	}
	
	

}
