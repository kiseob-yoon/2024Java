package thread;

public class EX02 {

	public static void main(String[] args) {
		Task task = new Task();
		Thread th = new Thread(task);
		th.start();
		mainTask();

	}
	public static void mainTask() {
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
