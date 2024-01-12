package sec01;

import java.util.Scanner;

public class ArraylnArrayEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		int count =0;
		
		System.out.print("행을 입력하세요:");
		int num1 = scanner.nextInt();
		
		System.out.print("열을 입력하세요:");
		int num2 = scanner.nextInt();
		
		int [][]scores = new int[num1][num2];
				
		for(int i=0; i < scores.length; i++) { // 4
			for(int j=0; j < scores[i].length; j++){
				System.out.printf("(%d, %d) 입력:", i, j);
				scores[i][j] = scanner.nextInt();
			}
		
		}
//		for(int i=0; i < scores.length; i++) { // 4
//			for(int j=0; j < scores[i].length; j++){
//				System.out.printf("(%d, %d) 입력:", i, j);
//				scores[i][j] = scanner.nextInt();
//				sum += scores[i][j];
//				count++;
//			}
//			
//		}		
		for(int[]arr: scores) {
			for(int val : arr) {
				sum +=val;
			}
		}
		//향상된 for문 활용
		
		
		avg = sum /(double)(num1*num2); //1. count변수 선언해서 돌아가는 숫자로 나누기 2. 행*열=합산 숫자로 나누기
		System.out.println("합계:" +sum);
//		avg = sum /(double)count;
		System.out.println("평균:" + avg);
	}

}
