package sec05.exam01;

public class AnimalEx {

	public static void main(String[] args) {
		Animal ani = new Animal();
//		ani.name = "사자" //필드명 직접 접근 허용 X 
		ani.setName("사자");
		System.out.println(ani.getName());
	}

}
