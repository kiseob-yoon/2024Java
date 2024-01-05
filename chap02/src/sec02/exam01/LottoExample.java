package sec02.exam01;

import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, num6;
		
		Random random = new Random();
		
		num1 = random.nextInt(45)+1;
		
		do {
			num2 = random.nextInt(45) +1;
		} while(num2 == num1);
		
		do {
			num3 = random.nextInt(45) +1;
		} while(num3 == num2 || num3 == num2);
		
		do {
			num4 = random.nextInt(45) +1;
		} while(num4 == num1 || num4 == num2 || num4 == num3);
		
		do {
			num5 = random.nextInt(45) +1;
		} while(num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
		
		do {
			num6 = random.nextInt(45) +1;
		} while(num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);
		
		System.out.printf("로또번호: %d, %d, %d, %d, %d, %d\n", num1, num2, num3, num4, num5, num6);

	}

}
