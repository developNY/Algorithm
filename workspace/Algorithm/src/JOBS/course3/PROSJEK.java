package JOBS.course3;

import java.util.Scanner;

public class PROSJEK {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}

		a[0] = b[0];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sum += a[j];
			}
			a[i] = b[i] * (i + 1) - sum;
			sum = 0;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
