package sec02.exam06;



public class InstanceofEX {

	public static void main(String[] args) {
//		Parent parentA = new Child(); //부모변수에 자식 객체 생성
//		method1(parentA);
//		method2(parentA);
		
		Parent parentB = new Parent(); //부모변수에 부모 객체 생성, 변환 불가능한애
//		Parent parentB = new Child(); //변환 가능한애
		if(parentB instanceof Child) { //parentB가 Child로 변환이 가능하냐?
			method2(parentB);
		} else {
			System.out.println("변환 불가능");
		}  

	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; 
		System.out.println("변환 가능");
	}

}


//1. 최초에 부모 타입으로 부모 객체를 생성해서 자식 타입으로 캐스팅하는 것 자체가 불가능하다. 
//2. 부모 변수로 객체를 자식으로 생성하고 다시 타입을 바꾸는 것은 가능(다운캐스팅)
//3. 다운캐스팅하려고 할때 안되는 경우는 바꾸려는 타입의 객체가 존재(생성)되지 않았을때이다.
