package JOBS.course2;
//거리사이의 절대값으로 풀면 쉽게 풀린다. 기준점이랑 좌표값이랑 절대값을 구해서 사거리보다 작거나 같으면 뒤집어서
//이중 for문 하나로 한번만 탐색해서 풀 수 있다.
import java.util.Scanner;

public class attackrange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int map[][] = new int[n][n];
		int unitX = scan.nextInt() - 1;
		int unitY = scan.nextInt() - 1;
		int x4[] = { -1, 0, 1, 0 };
		int y4[] = { 0, 1, 0, -1 };
		int ar = scan.nextInt();
		int nextX, nextY, num = 1;

		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < 4; j++) {
				nextX = unitX + x4[j] * num;
				nextY = unitY + y4[j] * num;
				if ((nextX < 0 || nextX >= n) || (nextY < 0 || nextY >= n)) {
					continue;
				}
				map[nextX][nextY] = num;
			}
			num++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == unitX && j == unitY) {
					System.out.print("x ");
				} else {
					System.out.print(map[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
