package sec01;

public class Bubble3 {
	public static void printArr(int a[]) { 
	for(int n:a) { 
		System.out.print(n+", "); 
	}
	System.out.println(); 
	}

	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2}; 
		printArr(a);
		printArr(a); 
		for(int i = 0; i <a.length; i++) { //0~4
			for(int j = 1; j <a.length; j++) { //1~4
				if(a[j] < a[j-1]) { // 1 < 0 // 2 < 1 // 3 < 2// 4 < 3 (1회차 4번 비교)
					int tmp = a[j];  // tmp = a[1] // [0]과[1]중에 [0]이 크니깐 [1]번째로 [0]이 가야해서 자리 비워둠 
					a[j] = a[j-1]; // a[1] = a[0] // 큰 값을 뒷자리로
					a[j-1] = tmp;  // a[0] = a[1] // 작은 값을 앞자리로
					printArr(a); 
				}
				
			}
			
		}
		printArr(a); 
		
	}

}

