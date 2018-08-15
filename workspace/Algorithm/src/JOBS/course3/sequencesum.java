package JOBS.course3;

import java.util.Scanner;

public class sequencesum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		int aa = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		aa = (a[0][1] + a[0][2] - a[1][2]) / 2;
		System.out.print(aa + " ");
		for(int i=1; i<n; i++) {
			System.out.print(a[0][i] - aa + " ");
		}
	}
}
