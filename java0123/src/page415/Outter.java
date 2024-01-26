package page415;

public class Outter {
	public void method1(final int arg) { //메서드내의 내부 클래스가 있을 경우 지역 변수 사용하면 사라지기 때문에 final로 선언하기로 되어있음. 또한, 내부 클래스에 피해를 끼치지 않기 위함
		final int localVar = 1;
//		arg = 100;
//		localVar = 1;
		class Inner{ //메서드 내의 클래스, 스레드를 사용하면 살아있을 수 있음 
			public void method() {
				int result = arg + localVar; 
			}
		}
		
		
	}

}


//프로세스 = 프로그램 실행되는 것 // 프로세서(CPU) //경량 프로세스(스레드)