package JOBS.course3;

import java.math.BigInteger;
import java.util.Scanner;

public class sequencesum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		int sum = 0, ex = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
				sum += a[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ex += a[i][j];
			}
			System.out.print(
					(BigInteger.valueOf(ex).subtract((BigInteger.valueOf(sum).divide(BigInteger.valueOf(2 * n - 2)))))
							.divide(BigInteger.valueOf(n - 2)) + " ");
			ex = 0;
		}
	}
}
