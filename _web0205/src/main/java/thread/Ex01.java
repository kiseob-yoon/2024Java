package thread;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("����");
		for(int i =0; i <5; i++) {
			System.out.println("����");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��");

	}

}
