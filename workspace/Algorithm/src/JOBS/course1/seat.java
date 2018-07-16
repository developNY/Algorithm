package JOBS.course1;

import java.util.Scanner;

public class seat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int num = scan.nextInt();
		int a[][] = new int[r][c];
		int visit[][] = new int[r][c];
		int cnt = 1;
		int number = 1;
		int i = 0, j = 0;
		
		if(c*r < num) {
			System.out.println("0");
			return;
		}
		
		while (number <= c*r) {
			if (cnt % 4 == 1) {
				if(cnt == 1) {
					j = 0;
				} else {
					j = cnt / 4;
				}
				for (; i < r; i++) {
					if (visit[i][j] == 0) {
						a[i][j] = number++;
						visit[i][j] = 1;
					} else {
						continue;
					}
				}
				cnt++;
			} else if (cnt % 4 == 2) {
				i -= (cnt / 4) + 1;
				for (; j < c; j++) {
					if (visit[i][j] == 0) {
						a[i][j] = number++;
						visit[i][j] = 1;
					} else {
						continue;
					}
				}
				cnt++;
			} else if (cnt % 4 == 3) {
				j -= (cnt / 4) + 1;
				for (; i >= 0; i--) {
					if (visit[i][j] == 0) {
						a[i][j] = number++;
						visit[i][j] = 1;
					} else {
						continue;
					}
				}
				cnt++;
			} else {
				i = cnt / 4 - 1;
				for (; j >= 0; j--) {
					if (visit[i][j] == 0) {
						a[i][j] = number++;
						visit[i][j] = 1;
					} else {
						continue;
					}
				}
				cnt++;
			}
		}
		for(int k=0; k<r; k++) {
			for(int l=0; l<c; l++) {
				if(num == a[k][l]) {
					System.out.print(l+1);
					System.out.print(" ");
					System.out.print(k+1);
				}
			}
		}
	}
}
