package thread;

public class Ex03 {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() { //Runnable�޼���� �����带 ����

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
		});
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
