package JOBS;

import java.util.Scanner;

public class tetris {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int a[][] = new int[c][r];
		int ii;
		int max = 0, cnt = 0;

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++)
				a[i][j] = scan.nextInt();
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (((a[i][j] == 0) && (i + 1 < 6) && (a[i + 1][j] == 1)) || ((i == c - 1) && (a[i][j] == 0))) {
					ii = i;
					for (int k = 0; k < 4; k++) {
						if ((a[ii--][j] != 0) || (ii - 3 < 0)) {
							break;
						}
					}
					for (int l = i; l < 4; l++) {
						a[ii--][j] = 1;
					}
					Loop1: for (int m = i; m >= 0; m--) {
						for (int n = 0; n < c; n++) {
							if (a[m][n] == 1) {
								continue;
							} else {
								break Loop1;
							}
						}
						cnt++;
					}
					if(cnt > max)
					max = cnt;
					cnt = 0;
					ii = i;
					for (int l = i; l < 4; l++) {
						a[ii--][j] = 0;
					}
				}
			}
		}
		System.out.println(max);
	}
}
