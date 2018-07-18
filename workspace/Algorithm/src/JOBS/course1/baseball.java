package JOBS.course1;

import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number[] = new int[num];
		int strike[] = new int[num];
		int ball[] = new int[num];
		int x, y, z, xx, yy, zz, sstrike = 0, bball = 0, cnt = 0, res = 0;

		for (int i = 0; i < num; i++) {
			number[i] = scan.nextInt();
			strike[i] = scan.nextInt();
			ball[i] = scan.nextInt();
		}

		for (int i = 123; i <= 987; i++) {
			x = (int) i / 100;
			y = (int) (i - x * 100) / 10;
			z = i - 100 * x - 10 * y;
			if(x == y || x == z || y == z || x == 0 || y == 0 || z == 0) {
				continue;
			}
			for (int j = 0; j < num; j++) {
				xx = (int) number[j] / 100;
				yy = (int) (number[j] - xx * 100) / 10;
				zz = number[j] - 100 * xx - 10 * yy;
				if (x == xx) {
					sstrike++;
				}
				if (y == yy) {
					sstrike++;
				}
				if (z == zz) {
					sstrike++;
				}
				if (x == yy || x == zz) {
					bball++;
				}
				if (y == xx || y == zz) {
					bball++;
				}
				if (z == xx || z == yy) {
					bball++;
				}
				if (sstrike == strike[j] && bball == ball[j]) {
					cnt++;
					sstrike = 0;
					bball = 0;
				} else {
					sstrike = 0;
					bball = 0;
				}
			}
			if (cnt == num) {
				res++;
				cnt = 0;
			} else {
				cnt = 0;
			}
		}
		System.out.println(res);
	}
}
