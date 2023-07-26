package 자바연습;

public class Ex13우측별삼각형 {

	public static void main(String[] args) {
		for(int k = 1; k<=5 ; k++) {
	         for(int i = 1 ; i <=5-k ;i++ ) {
	            System.out.print(" ");
	         }
	         for(int i = 1 ; i <=k ; i++ ) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	}

}
