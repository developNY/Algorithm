package JOBS.course2;

import java.util.Scanner;

public class rook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chase[][] = new int[8][8];
		int kingX = 0;
		int kingY = 0;
		int x4[] = { -1, 0, 1, 0 };
		int y4[] = { 0, -1, 0, 1 };
		int nextX, nextY;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chase[i][j] = scan.nextInt();
				if (chase[i][j] == 1) {
					kingX = i;
					kingY = j;
				}
			}
		}

		for (int i = 1; i < 9; i++) {
			for (int num = 0; num < 4; num++) {
				nextX = kingX + x4[num]*i;
				nextY = kingY + y4[num]*i;
				if (((nextX < 0) || (nextX >= 8)) || ((nextY < 0) || (nextY >= 8))) {
					continue;
				}
				if (chase[nextX][nextY] == 0) {
				} else if (chase[nextX][nextY] == 2) {
					System.out.println("1");
					return;
				} else if (chase[nextX][nextY] > 2) {
					x4[num] = 0;
					y4[num] = 0;
				}
			}
		}
		System.out.println("0");
	}
}
