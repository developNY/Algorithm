package JOBS.course3;

import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long res = 1;

		if (a > b) {
			for (int i = 2; i < a;) {
				if ((a % i == 0) && (b % i == 0)) {
					res *= i;
					a /= i;
					b /= i;
				} else {
					i++;
				}
			}
		} else {
			for (int i = 2; i < b;) {
				if ((a % i == 0) && (b % i == 0)) {
					res *= i;
					a /= i;
					b /= i;
				} else {
					i++;
				}
			}
		}
		System.out.println(res * a * b);
	}
}
