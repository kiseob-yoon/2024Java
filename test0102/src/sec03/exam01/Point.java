package sec03.exam01;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요:");
		int people = scanner.nextInt();
		
		for(int i = 0; i < people; i++) {
		
		System.out.print("점수를 입력하세요:");
		int grade = scanner.nextInt();
		
		if(grade == 100 || grade >= 90) {
			System.out.println("A");
		} else if(grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if(grade >=70 && grade < 80) {
			System.out.println("C");
		} else if(grade < 70) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		}
	}

}
