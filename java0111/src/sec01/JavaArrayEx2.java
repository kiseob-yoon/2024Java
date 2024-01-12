package sec01;

public class JavaArrayEx2 {

	public static void main(String[] args) {
		int a[] = {1,3,10,2,8};
		
		int sum =0;
		double avg = 0.0;
		int max = 0;
		
		for(int i =0; i < a.length; i++) {
			if(max < a[i]) { 
				max = a[i];
			}
			sum += a[i];
		}
		System.out.println("합계:" +sum); //1.합계
		avg = (double)sum/a.length;
		System.out.println("평균:" +avg); //2.평균
		System.out.println("맥스:" +max);
	}
	

}
