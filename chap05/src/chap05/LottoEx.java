package chap05;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		int [] lotto = new int[6]; //0~5(갯수 6개)
		Random rand = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(10);
			System.out.println(lotto[i]);
		}
		System.out.println("---------------");
		for(int val:lotto) {
			System.out.println(val);
			
		
		
//		for(int a : lotto) {
//			lotto[a] = rand.nextInt(10);
//			if(lotto[0] == lotto[a+1]) {
//				continue;
//			}
//			
//			System.out.println(lotto[a]);

		}
	}

}
