package JOBS.course3;

import java.util.Scanner;

public class findprime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num[] = new int[n];
		int max = 0, res = 0;

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= max; j++) {
				if (j != num[i]) {
					if (num[i] % j == 0) {
						break;
					}
				} else {
					res++;
					break;
				}
			}
		}
		System.out.println(res);
	}
}
