package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;

class Clock2 implements Runnable{
	JFrame df; 
	
	public Clock2(JFrame df) { //WinEmpŬ�������� WinEmp�� �޾ƿ�
		this.df = df; 
	}



	@Override
	public void run() {
		for(;;) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTimeFormat1 = 
					localDateTime.format(
							DateTimeFormatter.
							ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
			
//			System.out.println(localDateTimeFormat1);
//			WinEmp.this.setTitle(localDateTimeFormat1);
			df.setTitle(localDateTimeFormat1); //WinEmp�� �����Ͽ� setTitle�� �ð��� ���·� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
