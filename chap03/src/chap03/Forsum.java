package chap03;

public class Forsum {

	public static void main(String[] args) {
		int sum = 0;
		
		int i =0;
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) +" 합:" +sum); //i가 100조건을 만족하고 증감연산자로 101까지 도달

	}

}
