package JOBS.course2;

import java.util.Scanner;

public class classpresident {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int map[][] = new int[num][5];
		int student[][] = new int[num][num];
		int res[] = new int[num];
		int classNum, max = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 5; j++) {
				classNum = map[i][j];
				for (int k = 0; k < num; k++) {
					if (classNum == map[k][j]) {
						if (student[i][k] == 1) {
							continue;
						} else {
							student[i][k]++;
						}
					}
				}
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				res[i] += student[i][j];
			}
			res[i]--;
		}
		for (int i = 0; i < num; i++) {
			if (res[i] > max) {
				max = res[i];
			}
		}
		for (int i = 0; i < num; i++) {
			if (res[i] == max) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}
