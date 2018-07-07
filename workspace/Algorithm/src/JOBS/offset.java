package JOBS;

import java.util.Scanner;

public class offset {
	public static int compare(int a[][]) {
		int res = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if((i-1 >= 0) && (a[i][j] < a[i-1][j])) {
					if((j-1 >= 0) && (a[i][j] < a[i][j-1])) {
						if((i+1 <= 4) && (a[i][j] < a[i+1][j])) {
							if((j+1 <= 4) && (a[i][j] < a[i][j+1])) {
								res = 0;								
							}
						}
					}
				}
				else
					res = 1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				a[i][j] = scan.nextInt();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(compare(a) == 0) {
					System.out.print("* ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
