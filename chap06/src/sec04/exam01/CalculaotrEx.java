package sec04.exam01;

public class CalculaotrEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1 = cal.plus(100, 200);
		System.out.println(num1);
		
		double num2 = cal.plus(3.14, 5.09);
		System.out.println(num2);
		
		Calculator myCalu = new Calculator();
		
		double result1 = myCalu.areaRectangle(10);
		double result2 = myCalu.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
		
	
	}
	
	
	

}
