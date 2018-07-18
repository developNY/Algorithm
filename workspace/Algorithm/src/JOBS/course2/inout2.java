package JOBS.course2;

import java.util.Scanner;

public class inout2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[10][10];
		int num = scan.nextInt();
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		for (int l = 0; l < num; l++) {
			for (int i = 0; i < 10; i++) {
				if (a[l][i] == 0) {
					a[l][i] = 1;
				} else if (a[l][i] == 1) {
					a[l][i] = 0;
				}
			}

			for (int i = 0; i < 10; i++) {
				if (i == l) {
					continue;
				} else {
					if (a[i][l] == 0) {
						a[i][l] = 1;
					} else if (a[i][l] == 1) {
						a[i][l] = 0;
					}
				}
			}
		}
		for (int m = 0; m < 10; m++) {
			for (int l = 0; l < 10; l++) {
				System.out.print(a[m][l] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
