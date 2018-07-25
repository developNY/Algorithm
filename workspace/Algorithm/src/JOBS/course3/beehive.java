package JOBS.course3;

import java.util.Scanner;

public class beehive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ap = 1, i = 1;

		while (true) {
			ap += 6 * i;
			i++;
			if ((n >= ap) && (n < ap + 6 * i)) {
				System.out.println(i+1);
				return;
			}
		}
	}
}
