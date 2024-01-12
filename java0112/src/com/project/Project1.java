package com.project;

import java.util.Scanner;

public class Project1 {
	static Scanner scanner = new Scanner(System.in); //static 필드, 매개변수를 올리지 않아도 됨
	public static void disp1() { //static 메서드
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}
	
	public static void disp2() { //static 메서드
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("-------------------------------------");
	}
	
	public static void menu2(Session session) { //5.참조값 넘겨받음 // 2회차 MenuState가 true인 것을 매개변수로 받음
		while (session.isRun2()) { //6. 참조값 접근해서 isRun 메소드 호출(isRun을 따라가서 필드 확인 true임) // 2회차 ture로 아래 실행
			disp2();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("예금");
				break;
			case 2:
				// 회원 가입
				System.out.println("출금");
				break;
			case 3:
				// 예금 출금
				System.out.println("잔고");
				break;
			case 4:
//				session.setRun2(false);
				session.setMenuState(MenuState.DEPOSIT_EXIT);
				break;
			}
		}
//		session.setRun2(true);
		
	}
	
	public static void menu1(Session session) { //5.참조값 넘겨받음 // 2회차 M
		while (session.isRun()) { //6. 참조값 접근해서 isRun 메소드 호출(isRun을 따라가서 필드 확인 true임)
			disp1();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				if(session.getLoginInfo() != null) { //session 객체변수에 getLoginInfo메소드 호출//아래의 loginInfo객체 생성할떄 값넣어줘서 null값이 아님
//					session.setRun2(true); //
					session.setMenuState(MenuState.DEPOSIT); //MenuState를 true로 만들어줌
					menu2(session); // menu2 메소드 호출 MenuState가 true인 것을 메소드 매개변수에 넘겨줌
				}
				break;
			case 4:
//				session.setRun(false);
				session.setMenuState(MenuState.TOP_EXIT); //탑 메뉴 나감
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		LoginInfo loginInfo = new LoginInfo("id", "pass");
		Session session = new Session(true, false, loginInfo); //1. 객체 생성 및 생성자 true값으로 넘겨줌
		menu1(session); //4. meu1메소드 호출 session 참조값 넘겨줌
		
	}
}
