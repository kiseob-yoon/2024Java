package chap7.prob4;

public class ControllerEx {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setService(new MemberService()); //setService는 매개변수 MemberService로 설정됨. 인수값으로 입력할 수 있는 것은 상속을 받은 자식객체이다.
		controller.service.login();
		
		controller.setService(new AService()); 
		controller.service.login();
		
		
	}
}

//상속과 메서드 오버라이딩