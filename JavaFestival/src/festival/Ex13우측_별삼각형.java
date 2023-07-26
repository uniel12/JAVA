package festival;



public class Ex13우측_별삼각형 {

	public static void main(String[] args) {
		// 5개부터 공백이 점차 줄어들어드면서 반복 역삼각형
		// 공백 줄어드는 것만큼 별이 생김 삼각형
	    for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");                
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}
}
