package JOBS;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int array[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				array[i][j] = scan.nextInt();
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(array[a][b]);
	}
}
