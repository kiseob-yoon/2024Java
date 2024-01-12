package sec01;

public class Bubble1 {
	public static void printArr(int a[]) { //배열의 참조값 매개변수로 받음
	for(int n:a) { //배열의 길이만큼 반복
		System.out.print(n+", "); //길이만큼 출력함 
	}
	System.out.println(); //다음에 또 호출될때를 대비한 줄바꿈 코드 
	}

	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		printArr(a);
		printArr(a); //기존 배열 출력 {10, 3, 1, 4, 2}
		for(int i = 0; i <a.length; i++) { //0~4 
			for(int j = 0; j <a.length-1; j++) { //0~3
				if(a[j] > a[j+1]) { //앞값과 뒷값 비교 앞값이 크면(크지 않으면 실행x)   
					//자료 교환
					int tmp = a[j]; //a[0] = 10을 임시 거처 tmp에 담는다 
					a[j] = a[j+1]; //a[1] = 3을 a[0]에 담는다. 
					a[j+1] = tmp; //tmp = 10을 a[1]에 담는다 결과적으로 앞값과 뒷값의 뒤바꿈
					printArr(a); // 메소드 호출하고 배열변수 a를 보내줌 {3, 10, 1, 4, 2} 
				}
				
			}
			
		}
		printArr(a); //반복문이 종료되면 최종 결과 출력
		
	}

}

