package sec01;

public class ArrayPassing {
	
	public static void increase(int b[]) { //배열 자체가 참조형 
		for(int i = 0; i<b.length; i++) { 
			b[i]++; //받아온 값 = +1;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
//		increase(a);
//		increase(new int[] {1,2,3,4});
		for(int n : a) {
			System.out.println(n);
		}
	}

}
