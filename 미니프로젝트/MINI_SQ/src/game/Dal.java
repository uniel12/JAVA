package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Dal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> dallist = new ArrayList<String>();

		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("w");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("d");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("s");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");
		dallist.add("a");

		int z = 0;

		while (true) {

			System.out.println("w,a,s,d 방향키를 움직여서 한바퀴 완주하세요 (위쪽 방향으로 시작");
			String input = sc.next();
			if (input.equals(dallist.get(z))) {

				if (z == 0) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println("↑++++ ");
				} else if (z == 1) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println("↑+  + ");
					System.out.println(" ++++ ");
				} else if (z == 2) {
					System.out.println(" ++++ ");
					System.out.println("↑+  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 3) {
					System.out.println("↑++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 4) {
					System.out.println(" →    ");
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 5) {
					System.out.println("  →    ");
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 6) {
					System.out.println("   →  ");
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 7) {
					System.out.println("    →  ");
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 8) {
					System.out.println(" ++++↓ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++ ");
				} else if (z == 9) {
					System.out.println(" ++++  ");
					System.out.println(" +  +↓  ");
					System.out.println(" +  +  ");
					System.out.println(" ++++  ");
				} else if (z == 10) {
					System.out.println(" ++++ ");
					System.out.println(" +  +  ");
					System.out.println(" +  +↓  ");
					System.out.println(" ++++ ");
				} else if (z == 11) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  +  ");
					System.out.println(" ++++↓ ");
				} else if (z == 12) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++  ");
					System.out.println("    ←  ");

				} else if (z == 13) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++  ");
					System.out.println("   ←  ");

				} else if (z == 14) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++  ");
					System.out.println("  ←  ");

				} else if (z == 15) {
					System.out.println(" ++++ ");
					System.out.println(" +  + ");
					System.out.println(" +  + ");
					System.out.println(" ++++  ");
					System.out.println(" ←  ");
					System.out.println("성공!");

				}

			}

			z++;

		}
				
		
			
			
		
		
		
		
		
		
		
	}

}
