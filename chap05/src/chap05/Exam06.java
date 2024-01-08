package chap05;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[]scores = new int[30];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				continue;
			} else if(selectNo == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores" + "[" + scores[i]+ "] > ");
					int score = scanner.nextInt();
					scores[i] = score;
					continue;
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println("scores[i]>" +scores[i]);
					continue;
				}
				
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double average;
				for(int i =0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];	
					}
					sum += scores[i];
				}
				average = sum /studentNum;
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+average);
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
