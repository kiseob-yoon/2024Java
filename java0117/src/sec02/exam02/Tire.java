package sec02.exam02;

public class Tire {
	
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire(int maxRotation, String location) { //생성자 최대회전수, 위치를 매개변수 받음
		this.maxRotation = maxRotation; // 수명
		this.location = location; //타이어 위치
	}
	
	public boolean roll() { 
		++accumulatedRotation; //전위 연산자로 accumlatedRotation(누적) 증가
		if(accumulatedRotation<maxRotation) { //if문으로 accumlatedRotation(누적)보다 maxRotation(최대 회전수)가 작을때 까지
			System.out.println(location + "Tire 수명: " +  //타이어 위치+타이어 업체명
			(maxRotation-accumulatedRotation) + "회"); //수명 계산
			return true; //조건 성립시까지 돌린다. 
		} else { //수명이 다할시
			System.out.println("***" + location + " Tire 펑크 ***"); //구문 출력
			return false;
		}
	}
	

	

}
