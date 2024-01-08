package chap05;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int max = 0; // max값 초기화
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력하세요");
		int count = scanner.nextInt(); // count변수로 숫자 총 갯수 입력받음
		int[] array = new int[count]; // array배열에 입력받은 count를 대입
		for(int i = 0; i < count; i++) { //입력받은 count크기 만큼 반복
			System.out.print("정수입력:" ); // 정수입력
			array[i] = scanner.nextInt(); 
		}
		for(int a: array) { // 향상된 for문으로 (타입+변수명: 배열명) 형태이다
			if(max < a) { //변수로 선언한 max값과 배열에 담긴 변수들의 값을 비교하여 max보다 크면 max에 값 대입
				max = a;
			}
		}
		System.out.println("max: " + max); 
		
//		for(int i = 0; i < 5; i++) { 
//			if(max < array[i]) { //max값보다 배열의 값이 크면 배열값 반영
//				max = array[i]; 
//				index =i;
//			}
////		}

	
	}

}
