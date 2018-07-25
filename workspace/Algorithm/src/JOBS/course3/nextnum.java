package JOBS.course3;

import java.util.Scanner;

public class nextnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[3];
		int AP, GP, APnum = 0, GPnum = 0;

		while (true) {
			for (int i = 0; i < 3; i++) {
				num[i] = scan.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				AP = num[1] - num[0];
				if (AP == 0) {
					return;
				}
				GP = num[1] / num[0];
				if (APnum == 2) {
					System.out.print("AP ");
					System.out.println(num[i] + AP);
					APnum = 0;
					break;
				}
				if (GPnum == 2) {
					System.out.print("GP ");
					System.out.println(num[i] * GP);
					GPnum = 0;
					break;
				}
				if (num[i + 1] - num[i] == AP) {
					APnum++;
				}
				if (num[i + 1] / num[i] == GP) {
					GPnum++;
				}
			}
		}
	}
}
