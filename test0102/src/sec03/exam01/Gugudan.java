package sec03.exam01;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String end; // 문자열을 받을 변수 선언
	
		for(;;) { // 무한루프
		System.out.print("단을 입력하세요(종료시 q):");
		end = scanner.nextLine(); // 문자열 반환하는 end변수 
		
		if(end.equals("q")) { // 입력값으로 q입력하면 구문종료 	
			break;
		}
		int dan = Integer.parseInt(end); // 입력받은값이 q가 아니고 정수형이면 int형으로 변환
		
		for(int i= 1; i <=9; i++) {
				System.out.printf("%d X %d = %d\n",dan, i, dan  i);
				}
			}		
		System.out.println("종료"); // 종료 메시지
			
		}

	}


