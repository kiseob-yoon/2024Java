package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

//class MyClass{}
class Acc{
//	MyClass mc = new MyClass();
	int x;
	String method() {
		return "문자열";
	}
}

public class VehicleEx {

	public static void main(String[] args) {
		List<Acc> list = new ArrayList<>();
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc());
		
		for(Object obj : list) {
			Acc acc = (Acc)obj; //메모리 주소값이라 형변환해도 자료손실은 발생하지 않는다. 기본형 타입에서는 자료손실 발생함.
			String result = acc.method();
			System.out.println(result);
		}
		
		Vehicle vehicle = new Bus();		
		vehicle.run();
		if(vehicle instanceof Bus) {
			System.out.println("가능");
		}
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFace();
	}

}
