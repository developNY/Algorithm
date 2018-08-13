package JOBS.course3;

import java.util.Scanner;

public class fractionsum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[2][2];
		int r = 1, max, min, son, lcm;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		if (a[0][1] > a[1][1]) {
			max = a[0][1];
			min = a[1][1];
		} else {
			max = a[1][1];
			min = a[0][1];
		}

		while (r > 0) {// 유클리드 호제법을 이용한 GCD(최대공약수)구하기
			r = max % min;
			max = min;
			min = r;
		}
		
		lcm = (a[0][1] / max) * (a[1][1] / max) * max;
		son = ((lcm / a[0][1]) * a[0][0]) + ((lcm / a[1][1]) * a[1][0]);
		
		for (int i = 2; i <= lcm;) {
			if ((son % i == 0) && (lcm % i == 0)) {
				son /= i;
				lcm /= i;
				continue;
			} else {
				i++;
			}
		}

		System.out.print(son + " " + lcm);
	}
}
