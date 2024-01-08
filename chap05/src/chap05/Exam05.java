package chap05;

public class Exam05 {

	public static void main(String[] args) {
		double sum = 0;
		double average;
		double[] array = new double [] {83.2,89.5,90.8};
		for(int i =0; i < array.length; i++) {
			sum += array[i];
			
		}
		System.out.println("합계: " + sum);
		
		average = (double)sum / array.length;
		System.out.println ("평균: " + average);
		

	}

}
