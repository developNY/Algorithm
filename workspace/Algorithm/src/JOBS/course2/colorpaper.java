package JOBS.course2;

import java.util.Scanner;

public class colorpaper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int map[][] = new int[101][101];
		int num = scan.nextInt();
		int x[] = new int[num];
		int y[] = new int[num];
		int ga[] = new int[num];
		int se[] = new int[num];
		int a = 0;
		int res[] = new int[101];

		for (int i = 0; i < num; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			ga[i] = scan.nextInt();
			se[i] = scan.nextInt();
		}

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				for (int k = x[a]; k < x[a] + ga[a]; k++) {
					for (int l = y[a]; l < y[a] + se[a]; l++) {
						map[k][l] = a + 1;
					}
				}
				a++;
				if (a == num) {
					for (int m = 0; m < 101; m++) {
						for (int n = 0; n < 101; n++) {
							res[map[m][n]]++;
						}
					}
					for (int b = 1; b <= num; b++) {
						System.out.println(res[b]);
					}
					return;
				}
			}
		}

	}
}
