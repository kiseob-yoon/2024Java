package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExClock {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());

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
		System.out.println("����");
	}
}
