package JOBS.course3;

import java.util.Scanner;

public class combinationzero2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int two = 0, five = 0, exn = n, exm = m, r = m;

		for (int i = 0; i < r; i++) {
			while (true) {
				if (n % 2 == 0) {
					two++;
					n /= 2;
					continue;
				} else if (n % 5 == 0) {
					five++;
					n /= 5;
					continue;
				} else {
					break;
				}
			}
			exn--;
			n = exn;

			while (true) {
				if (m % 2 == 0) {
					two--;
					m /= 2;
					continue;
				} else if (m % 5 == 0) {
					five--;
					m /= 5;
					continue;
				} else {
					break;
				}
			}
			exm--;
			m = exm;
		}

		if (two >= five) {
			System.out.println(five);
		} else {
			System.out.println(two);
		}

	}
}
