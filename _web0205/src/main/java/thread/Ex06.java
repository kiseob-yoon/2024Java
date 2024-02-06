package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex06 {

	public static void main(String[] args) {
		Thread th = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					LocalDateTime localDateTime = LocalDateTime.now();
					String localDateTimeFormat1 = 
							localDateTime.format(
									DateTimeFormatter.
									ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
					System.out.println(localDateTimeFormat1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("time out");
			}
		};
		th.start();
		mainTask();
	}
	public static void mainTask() {
		for(int i = 0; i < 5; i++) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTimeFormat1 = 
					localDateTime.format(
							DateTimeFormatter.
							ofPattern("yyyy-MM-dd-HH-mm-ss"));
			System.out.println(localDateTimeFormat1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The end");
	}

}
