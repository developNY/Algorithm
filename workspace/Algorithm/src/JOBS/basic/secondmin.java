package JOBS.basic;

import java.util.Scanner;

public class secondmin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[9];
		int min = 0, num = 0;

		for (int i = 0; i < 9; i++) {
			a[i] = scan.nextInt();
		}

		min = a[0];

		for (int i = 1; i < 9; i++) {
			if (a[i] < min) {
				min = a[i];
				num = i;
			}
		}
		a[num] = 10000000;
		min = a[0];
		for (int i = 1; i < 9; i++) {
			if (a[i] < min) {
				min = a[i];
				num = i;
			}
		}
		System.out.println(min);
		System.out.println(num + 1);
	}
}
