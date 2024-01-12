package sec04.exam01;

public class Calculator {
	int plus(int x, int y) {
		return x+y;
	}
	double plus(double x, double y) {
		return x+y;
	}
	
	double areaRectangle(double width) {
		return width *width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
}

//메서드 오버로딩 메서드 이름은 같으나 타입이나 매개변수의 개수가 달라야 한다.