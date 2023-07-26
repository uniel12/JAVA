package festival;

public class Ex06마플while {

	public static void main(String[] args) {
		// While
		
		int num = 0; 
		int sum1 = 0;
		int sum2 = 0;
		while (num < 100) { 
			  num++; 
			 if (num % 2 == 1) { 
				 System.out.print((num*+1)+" ");
			 sum1 += num; 
			 } else {
				 System.out.print((num*-1) + " ");
			   sum2 -= num;  
			  }
			}
		System.out.println();
		System.out.print("결과 : " + (sum1+sum2));

	}

}
