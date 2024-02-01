package sec01.exam01;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //잠시 멈춤 500이면 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("main 종료");

	}

}
//start()메소드를 통해 별도의 스레드가 시작되고, 이 스레드는 BeepTask클래스의 run메서드를 실행한다.
//메인메서드의 스레드는 start와는 별도로 작동한다. 
//결과적으로 두 스레드는 별도의 실행 흐름을 가지며 독립적으로 동작한다. 
