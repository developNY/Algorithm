package JOBS.course1;
//이렇게 하면 안되고 하나씩 비교해서 strike++, ball++해서 그 스트라이크와 볼의 수가 같으면 cnt++하는 식으로 해야 함.
import java.util.Scanner;

public class baseball {
	static int correct = 0;

	static void ball(int x, int y, int z, int xx, int yy, int zz, int ball) {
		if (ball == 0) {
			if (x == yy || x == zz || y == xx || y == zz || z == xx || z == yy) {
				correct++;
			} else {
				correct = 0;
			}
		} else if (ball == 1) {
			if (x == yy || x == zz || y == xx || y == zz || z == xx || z == yy) {
				correct++;
			} else {
				correct = 0;
			}
		} else if (ball == 2) {
			if ((x == yy && x == zz) || (y == xx && y == zz) || (z == xx && z == yy)) {
				correct++;
			} else {
				correct = 0;
			}
		} else if (ball == 3) {
			if ((x == zz && y == xx && z == yy) || (x == yy && y == zz && z == xx)) {
				correct++;
			} else {
				correct = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number[] = new int[num];
		int strike[] = new int[num];
		int ball[] = new int[num];
		int x, y, z, xx, yy, zz, cnt = 0, res = 0;

		for (int i = 0; i < num; i++) {
			number[i] = scan.nextInt();
			strike[i] = scan.nextInt();
			ball[i] = scan.nextInt();
		}

		for (int i = 123; i <= 987; i++) {
			x = (int) i / 100;
			y = (int) (i - x * 100) / 10;
			z = i - 100 * x - 10 * y;
			for (int j = 0; j < num; j++) {
				xx = (int) number[j] / 100;
				yy = (int) (number[j] - xx * 100) / 10;
				zz = number[j] - 100 * xx - 10 * yy;
				if (strike[j] == 0) {
					if (x != xx && y != yy && z != zz) {
						correct++;
						ball(x, y, z, xx, yy, zz, ball[j]);
					} else {
						correct = 0;
						break;
					}
				} else if (strike[j] == 1) {
					if (x == xx || y == yy || z == zz) {
						correct++;
						ball(x, y, z, xx, yy, zz, ball[j]);
					} else {
						correct = 0;
						break;
					}
				} else if (strike[j] == 2) {
					if ((x == xx && y == yy) || (z == zz && y == yy) || (x == xx && z == zz)) {
						correct++;
						ball(x, y, z, xx, yy, zz, ball[j]);
					} else {
						correct = 0;
						break;
					}
				} else if (strike[j] == 3) {
					System.out.println("1");
					return;
				}
				if (correct == 2) {
					cnt++;
					correct = 0;
				} else {
					System.out.println("correct: " + correct);
					correct = 0;
				}
			}
			if (cnt == num) {
				res++;
				cnt = 0;
			} else {
				System.out.println("cnt: " + cnt);
				cnt = 0;
			}
		}
		System.out.println(res);
	}
}
