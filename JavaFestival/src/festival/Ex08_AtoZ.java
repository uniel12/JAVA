package festival;

public class Ex08_AtoZ {

	public static void main(String[] args) {
		// A-Z까지 출력
		for(int i = 65; i<=90; i++){
			System.out.print(i+" ");
			System.out.println((char)i + " ");
		}
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        for(int i = 65; i <=90 ; i++) {
//        	int ascii = i;
//        	//아스키 코드로 10진수 16진수 알파벳 출력
//        	int dec = ascii;
//        	String hex = Integer.toHexString(ascii);
//        	hex = hex.toUpperCase();
//        	char A = (char)ascii;
//        System.out.println(dec+" 0x"+hex +" "+A); //아스키코드 10진수 출력
//        
//		}

	}
}
//	for(int i = 0; i < 128; i++) {
//
//        int ascii = i;
//        
//        System.out.println(ascii); //10진수
//        System.out.println(Integer.toBinaryString(ascii)); //2진수
//        System.out.println(Integer.toOctalString(ascii)); //8진수
//        System.out.println(Integer.toHexString(ascii)); //16진수
//        System.out.println((char)ascii); // character