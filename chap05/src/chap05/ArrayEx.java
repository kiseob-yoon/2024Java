package chap05;

public class ArrayEx {

	public static void main(String[] args) {
//		int[] scores = {83, 90, 97}; //배열은 기본적으로 참조형
//		System.out.println(scores.length);
		
		int [] scores = new int[3]; // 힙 영역 생성 개수(외워라) int는 기본형이지만 []표시가 있으면 배열로 참조형이 됨
		
		for(int i = 0; i < scores.length; i++) { //scores.length(배열의 길이)
			System.out.println(scores[i]); //scores 배열의 값을 출력(초기값으로 0)
		}
		
		String str = "abc"; //변수 선언 및 초기화
		System.out.println(str.length()); //위 변수 글자타입의 길이 
		
		String [] names = new String[5]; //배열 크기 5개의 names 변수 선언
		names[0] = str; //변수 받아서 배열[0]번째에 대입
		names[1] = "김하나"; // 배열[1]번째에 값 대입
		names[2] = "강하나"; // 배열[2]번째에 값 대입
		for(int i = 0; i <names.length; i++) { 
			System.out.println(names[i]); //names 배열의 값 출력
		}
		
		
	}

}
