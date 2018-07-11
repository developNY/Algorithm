package JOBS.course1;

import java.util.Scanner;

public class bingo {
	static int cnt = 0;
	
	static void row(int bingo[][]) {
		int zero = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bingo[i][j] == 0) {
					zero++;
					if(zero == 5) {
						cnt++;
					}
				}
			}
			zero = 0;
		}
	}
	
	static void col(int bingo[][]) {
		int zero = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bingo[j][i] == 0) {
					zero++;
					if(zero == 5) {
						cnt++;
					}
				}
			}
			zero = 0;
		}
	}

	static void diagonal(int bingo[][]) {
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bingo[][] = new int[5][5];
		int call[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				bingo[i][j] = scan.nextInt();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				call[i][j] = scan.nextInt();
		}
		
		first: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					for(int l=0; l<5; l++) {
						if(call[i][j] == bingo[k][l]) {
							bingo[k][l] = 0;
							row(bingo);
							if(cnt == 3) {
								System.out.println(i*5+(j+1));
								break first;
							}
							col(bingo);
							if(cnt == 3) {
								System.out.println(i*5+(j+1));
								break first;
							}
							diagonal(bingo);
							if(cnt == 3) {
								System.out.println(i*5+(j+1));
								break first;
							}
						}
					}
				}
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.print(bingo[i][j] + " ");
			System.out.println();
		}
	}
}
