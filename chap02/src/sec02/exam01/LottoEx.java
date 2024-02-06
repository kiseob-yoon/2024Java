package sec02.exam01;

import java.util.Random;
import java.util.Scanner;


public class LottoEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int num = (int)(Math.random()*9+1);
			int num2 = (int)(Math.random()*9+1);
			int sum = num + num2;
			System.out.println(num + "x" + num2);
			int lotto = scanner.nextInt();
			if(lotto == sum) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다. 다른 문제를 풀어보세요");
			}
	
		}
	}
		
}
		




