package thread;

public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("task ����");
		for(int i =0; i <5; i++) {
			System.out.println("task ����");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("task ��");
	}

}
