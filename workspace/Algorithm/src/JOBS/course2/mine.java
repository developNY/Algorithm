package JOBS.course2;

import java.util.Scanner;

public class mine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int map[][] = new int[n][m];
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = scan.nextInt();
			}
		}
	}
}
