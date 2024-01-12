package sec01;

public class JavaArrayEx {

	public static void main(String[] args) {
		int a[] = {10,3,1,4,2};
		
		int idx =-1;
		for(int i = 0; i < a.length; i++) {
			if(a[i]==4) {
				idx = i;
			}
		}
			if(idx != -1) {
				System.out.println("인덱스: " + idx);
			} else {
				System.out.println("못찾음");
			}
			

		int x = 10;
		int y = 20;
		
		int temp = x;
		x = y;
		y= temp;
		
		System.out.println("x값은:" + x);
		System.out.println("y값은:" + y);
	}
	

}
