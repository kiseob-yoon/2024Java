package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; //null,상수(대문자)로 초기화 가능 // 
		
		Calendar cal = Calendar.getInstance(); //getInstance(static)
		int year =cal.get(Calendar.YEAR);
		System.out.print("연:"+ year);
		int month =cal.get(Calendar.MONTH)+1;
		System.out.print(" 월:"+ month);
		int day =cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(" 일:"+ day);
		
		int week =cal.get(Calendar.DAY_OF_WEEK);
		
		
		switch(week) {
		case 1:
			today = Week.일; break;
		case 2:
			today = Week.월; break;
		case 3:
			today = Week.화; break;
		case 4:
			today = Week.수; break;
		case 5:
			today = Week.목; break;
		case 6:
			today = Week.금; break;
		case 7:
			today = Week.토; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.일) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
