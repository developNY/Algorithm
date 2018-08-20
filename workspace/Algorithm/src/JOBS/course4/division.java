package JOBS.course4;

import java.util.Scanner;

public class division {
	public static String div(int num) {
		if (num == 1) {
			return "1";
		} else {
			return "" + "";
			div(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		div(num);
	}
}
