package festival;

import java.util.Scanner;

public class Ex33알파벳빈도수 {

	public static void main(String[] args) {
		
		  int[] alphabet_count = new int[26];
			System.out.print("입력>> ");
			Scanner sc = new Scanner(System.in);
			String alpha = sc.nextLine();  // 한줄을 다 읽음
			
			// 스페이스바 = 32
			char[] char_b = alpha.toCharArray();

			// Upper
			for(int i = 0; i<alpha.length();i++) {
				//System.out.print(char_b[ii]);
				if((int)char_b[i]<97 && (int)char_b[i] >= 65) { // 대문자를 소문자로 바꿔주는것
					char_b[i] += 32;    // 대문자  A 65   a 97   차이를 매꿔주기 위해 32를 더해줌
				}
				
			}
			for(int j = 0; j<char_b.length;j++) {
				switch (char_b[j]) {
				case 'a': {
					alphabet_count[0] +=1;
					break;
				}
				case 'b': {
					alphabet_count[1] +=1;
					break;
				}
				case 'c': {
					alphabet_count[2] +=1;
					break;
				}
				case 'd': {
					alphabet_count[3] +=1;
					break;
				}
				case 'e': {
					alphabet_count[4] +=1;
					break;
				}
				case 'f': {
					alphabet_count[5] +=1;
					break;
				}
				case 'g': {
					alphabet_count[6] +=1;
					break;
				}
				case 'h': {
					alphabet_count[7] +=1;
					break;
				}
				case 'i': {
					alphabet_count[8] +=1;
					break;
				}
				case 'j': {
					alphabet_count[9] +=1;
					break;
				}
				case 'k': {
					alphabet_count[10] +=1;
					break;
				}
				case 'l': {
					alphabet_count[11] +=1;
					break;
				}
				case 'm': {
					alphabet_count[12] +=1;
					break;
				}
				case 'n': {
					alphabet_count[13] +=1;
					break;
				}
				case 'o': {
					alphabet_count[14] +=1;
					break;
				}
				case 'p': {
					alphabet_count[15] +=1;
					break;
				}
				case 'q': {
					alphabet_count[16] +=1;
					break;
				}
				case 'r': {
					alphabet_count[17] +=1;
					break;
				}
				case 's': {
					alphabet_count[18] +=1;
					break;
				}
				case 't': {
					alphabet_count[19] +=1;
					break;
				}
				case 'u': {
					alphabet_count[20] +=1;
					break;
				}
				case 'v': {
					alphabet_count[21] +=1;
					break;
				}
				case 'w': {
					alphabet_count[22] +=1;
					break;
				}
				case 'x': {
					alphabet_count[23] +=1;
					break;
				}
				case 'y': {
					alphabet_count[24] +=1;
					break;
				}
				case 'z': {
					alphabet_count[25] +=1;
					break;
				}
				}
			}
			for(int i = 0; i<26;i++) {
				System.out.println((char)(97+i) + " : " + alphabet_count[i]);
			}
			sc.close();
		}
	}