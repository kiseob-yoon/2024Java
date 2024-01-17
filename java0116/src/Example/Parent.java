package Example;

public class Parent {
	public String nation;
	
	public Parent() { //6.super로 올라옴
		this("대한민국"); //7. 매개변수 있는 생성자 호출
		System.out.println("Parent()call"); //9. 매개변수 있는 생성자 끝나고 다시 올라와서 이 구문 출력
	}
	
	public Parent(String nation) { //8. 대한민국 매개변수로 받음
		this.nation = nation; //9.값 저장
		System.out.println("Parent(String nation)call"); //10.호출
	}

}
