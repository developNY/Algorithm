package JOBS.course3;

import java.util.Scanner;

public class nextnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[3];
		int AP, GP, zero=0;

		while (true) {
			for (int i = 0; i < 3; i++) {
				num[i] = scan.nextInt();
			}
			if (num[1] - num[0] == num[2] - num[1]) {
				System.out.print("AP ");
				System.out.println(num[2] + num[1] - num[0]);
			} else if (num[1] / num[0] == num[2] / num[1]) {
				System.out.print("GP ");
				System.out.println(num[2] * (num[1] / num[0]));
			}
		}
	}
}
