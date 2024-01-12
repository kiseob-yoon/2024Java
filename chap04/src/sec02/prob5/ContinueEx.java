package sec02.prob5;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = null;
		
		int[] arr2 = null; //배열 선언
		System.out.println("크기:");
		int scan = scanner.nextInt();
		arr2 = new int[scan]; //배열 초기화
		arr = arr2; // 힙에 있는 메모리 주소값을 복사
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr2[1]=100;
		System.out.println(arr[1]); //힙에 있는 주소값을 독점하고 있는 것이 아니다라는 것을 보여줌
		
//		for(int i= 0; i <10; i++) {
//			System.out.println(i);
//			if(i == 6) {
//			continue;
//			}
//			System.out.println("나올까요?");
//		}

	}

}
