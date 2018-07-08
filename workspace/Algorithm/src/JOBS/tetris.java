package JOBS;

import java.util.Scanner;

public class tetris {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int a[][] = new int[c][r];
		
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++)
				a[i][j] = scan.nextInt();
		}
		
	}
}
