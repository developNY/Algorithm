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
		int zero = 0;
		for (int i = 0; i < 5; i++) {
			if (bingo[i][i] == 0) {
				zero++;
			}
		}
		if (zero == 5) {
			cnt++;
			zero = 0;
		}
		zero=0;
		for (int i = 0; i < 5; i++) {
			if (bingo[i][4-i] == 0) {
				zero++;
			}
		}
		if (zero == 5) {
			cnt++;
			zero = 0;
		}
		zero=0;
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
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					for(int l=0; l<5; l++) {
						if(call[i][j] == bingo[k][l]) {
							cnt = 0;	//이걸 안하면 빙고가 1개라도 생기면 같은것을 계속 cnt증가시키기 때문에 이걸 해줘야 한다. 그래도 어차피 계속 for문을 통해서 탐색을 하고 있기 때문.
							bingo[k][l] = 0;
							row(bingo);
							col(bingo);
							diagonal(bingo);
							if(cnt >= 3) {//갑자기 0에서 4빙고가 될 수 있끼 때문에 == 3 이라고 하면 안되는 거다.
								System.out.println(i*5+(j+1));
								return;
							}
						}
					}
				}
			}
		}
	}
}
