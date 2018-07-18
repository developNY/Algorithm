package JOBS.course2;

import java.util.Scanner;

public class rook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chase[][] = new int [8][8];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				chase[i][j] = scan.nextInt();
			}
		}
		
		
	}
}
