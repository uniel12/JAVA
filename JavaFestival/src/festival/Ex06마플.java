package festival;

public class Ex06마플 {

	public static void main(String[] args) {
		// for문
		int sum1=0;
		int sum2=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
			System.out.print((i*-1) + " ");
			sum1 -=i;
			}else {
				System.out.print((i*+1)+" ");
			sum2 +=i;			
			}
		}
		System.out.println();
		System.out.print("결과 : " + (sum1+sum2));

	}

}
