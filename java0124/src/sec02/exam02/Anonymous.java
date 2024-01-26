package sec02.exam02;

public class Anonymous {
	
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켜다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끄다");
			}
		}; //필드는 지역변수 선언할때 초기화 안해도 되지만 메서드 호출떄는 필수!
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
