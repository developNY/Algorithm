package JOBS.course3;

import java.util.Scanner;

public class fmttalpha {
	public static int moving(int cha, int move, int num) {
		if (cha > 1) {
			cha -= move;
			num++;
			for (int i = -1; i < 2; i++) {
				move -= i;
				if (move == 0) {
					continue;
				} else {
					moving(cha, move, num);
				}
			}
		} else if (cha == 0) {
			return num;
		} else if (cha < 0) {
			return -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int res[] = new int[100];
		int max=0;

		for(int i=0; i<100; i++) {
			if(moving(y - x, 1, 0) == -1) {
				continue;
			} else {
				if(res[i] != moving(y - x, 1, 0)) {
					res[i] = moving(y - x, 1, 0);
				} else {
					continue;
				}
			}
		}
		
		for(int j=0; j<100; j++) {
			if(res[j] > max) {
				max = res[j];
			}
		}
		System.out.println(max);
	}
}
