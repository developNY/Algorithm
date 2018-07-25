package JOBS.course2;

import java.util.Scanner;

public class mine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int map[][] = new int[n][m];
		int x8[] = { 0, 1, 0, -1, 1, 1, -1, -1 };
		int y8[] = { 1, 0, -1, 0, 1, -1, -1, 1 };
		int x = scan.nextInt() - 1;
		int y = scan.nextInt() - 1;
		int nextX, nextY, num = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 8; i++) {
			if (map[x][y] == 1) {
				System.out.println("game over");
				return;
			} else {
				nextX = x + x8[i];
				nextY = y + y8[i];
				if ((nextX < 0 || nextX >= n) || (nextY < 0 || nextY >= n)) {
					continue;
				}
				if (map[nextX][nextY] == 1) {
					num++;
				}
			}
		}
		System.out.println(num);
	}
}
