
public class Ex07실습7 {

	public static void main(String[] args) {

		// 3행 4열 별찍기
		// ****
		// ****
		// ****
		for (int k = 1; k <= 3; k++) {

			for (int i = 1; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
//		for(int i=1; i<=4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();

//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		System.out.println("------------------");

		// 오름차순 별찍기(별삼각형)
		for (int k = 1; k <= 5; k++) {

			for (int i = 1; i <= k; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("------------------");

		// 내림차순 별찍기(별역삼각형)
		for (int k = 5; k >= 1; k--) {

			for (int i = 1; i <= k; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

//		for(int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=1; i<=1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
		System.out.println("------------------");

		for (int k = 1; k <= 5; k++) {

			for (int i = 5; i >= k; i--) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = 1; j <= k; j++) {
				System.out.print(" ");
			}
		}
		System.out.println("------------------");
		
		// 오름차순 좌우대칭 별찍기(우측 별삼각형)
		//별기준
		 for (int k = 1; k <= 5; k++) {
	         // 공백출력
	         for (int i = 1; i <= 5-k; i++) {
	            System.out.print(" ");
	         }
	         // 별출력
	         for (int i = 1; i <= k; i++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }


		
		
		
		
		
		

		
	}

}
