package JOBS.basic;

import java.util.Scanner;

public class dicegame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[][] = new int[num][3];
		int max = 0;
		int money[] = new int[num];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<num; i++) {
			if((a[i][0] == a[i][1]) && (a[i][1] == a[i][2])) {
				money[i] = 10000 + (a[i][0] * 1000);
				continue;
			} else if((a[i][0] != a[i][1]) && (a[i][1] != a[i][2]) && (a[i][0] != a[i][2])) {
				for(int j=0; j<3; j++) {
					if(a[i][j] > max)
						max = a[i][j];
				}
				money[i] = max * 100;
				continue;
			} else {
				if(a[i][0] == a[i][1]) {
					money[i] = 1000 + (a[i][0] * 100);
					continue;
				} else {
					money[i] = 1000 + (a[i][2] * 100);
					continue;
				}
			}
		}
		
		max = 0;
		for(int i=0; i<num; i++) {
			if(money[i] > max) {
				max = money[i];
			}
		}
		System.out.println(max);
	}
}
