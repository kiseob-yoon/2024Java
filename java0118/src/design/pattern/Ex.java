package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
//		CarFactory carFactory = new KoreaCarFactory(); //부모인 CarFactory변수에 자식인 KoreaCarFactory객체 생성
		
		Scanner scanner = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("생산하려는 차종을 선택 (1:국산차, 2:미국차)");
		System.out.print("선택:");
		String key = scanner.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory(); //조건에 맞으면 국산공장 객체 생산
			break;
		case "2":
			carFactory = new StateCarFactory(); //조건에 맞으면 미국산 공장 객체 생산
			break;
		default:
			System.out.println("다시 선택하세요");
			break;
		}
		
		TireProduct tireProduct = carFactory.createTire(); //CarFactory에 TireProduct타입의 객체를 생성하고 있어 메인 메소드에서 타입을 사용할 수 있음. CarFactory에 접근하여 createTire메소드 접근 이 메소드는 오버라이딩 되어 있어 koreaCarFactory의 것을 불러온다.
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble(); //tireProduct에 makeAssemble메소드가 있어 호출하여 tire변수에 넘겨줌
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);

	}

}
