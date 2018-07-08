package JOBS;

import java.util.Scanner;

public class offset {
	static int a[][] = new int[5][5];
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, -1, 0, 1};
	static int s;

	static boolean isInside(int x, int y) {
		return (x>=0 && x<5) && (y>=0 && y<5);
	}
	
	static void dfs(int x, int y) {
		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(isInside(nextX, nextY) && a[x][y] >= a[nextX][nextY]) {
				s = 1;
				break;
			} else {
				s = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				a[i][j] = scan.nextInt();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				dfs(i,j);
				if(s == 1)
					System.out.print(a[i][j] + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
