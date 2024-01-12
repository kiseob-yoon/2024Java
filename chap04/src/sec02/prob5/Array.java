package sec02.prob5;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n = sum(a);
		System.out.println(n);
		

	}
	
	public static int sum(int[]x) {
		int sum =0;
		for(int n = 0; n <x.length; n++) {
			sum+=x[n];
		}
		return sum;
	}

}
