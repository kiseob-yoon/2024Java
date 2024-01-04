package sec02.exam01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double value = 2e-323;
		float num1 = 123.456619898198112298f;
		double num2 = 123.456619898198112298;
		
		System.out.println("float형 변수 num1: " + num1);
		System.out.println("double형 변수 num1: " + num2);
		
		double var = 0.1;
		for(int i = 0; i < 1000; i++) {
			var += 0.1;
		}
		System.out.println(var);
		
	}

}
