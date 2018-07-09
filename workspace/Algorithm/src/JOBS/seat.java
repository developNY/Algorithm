package JOBS;

import java.util.Scanner;

public class seat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int num = scan.nextInt();
		int a[][] = new int[r][c];
		int visit[][] = new int[r][c];
		int dx[] = { 0, 1, 0, -1 };
		int dy[] = { 1, 0, -1, 0 };
		int cnt = 1;
		int i = 0, j = 0;
		int number = 1;
		
		while(cnt < 12) {
		if (cnt % 4 == 1) {
			for(int k=0; k<r; k++) {
				int newX = i + dx[0];
				int newY = i + dy[0];
				if(visit[newX][newY] == 1) {
					continue;
				} else {
					a[newX][newY] = number++;
					visit[newX][newY] = 1;
				}
			}
			cnt++;
		} else if (cnt % 4 == 2) {
			for(int k=0; k<c; k++) {
				int newX = i + dx[1];
				int newY = i + dy[1];
				if(visit[newX][newY] == 1) {
					continue;
				} else {
					a[newX][newY] = number++;
					visit[newX][newY] = 1;
				}
			}
			cnt++;
		} else if (cnt % 4 == 3) {
			for(int k=0; k<r; k++) {
				int newX = i + dx[2];
				int newY = i + dy[2];
				if(visit[newX][newY] == 1) {
					continue;
				} else {
					a[newX][newY] = number++;
					visit[newX][newY] = 1;
				}
			}
			cnt++;
		} else {
			for(int k=0; k<c; k++) {
				int newX = i + dx[3];
				int newY = i + dy[3];
				if(visit[newX][newY] == 1) {
					continue;
				} else {
					a[newX][newY] = number++;
					visit[newX][newY] = 1;
				}
			}
			cnt++;
		}}
		for(int ii=0; ii<c; ii++) {
			for(int jj=0; jj<r; jj++) {
				System.out.print(a[ii][jj]);
			}
			System.out.println();
		}
	}
}
