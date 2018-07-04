package JOBS;

import java.util.Scanner;

public class dicegame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[][] = new int[num][3];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<num; i++) {
			if((a[i][0] == a[i][1]) && (a[i][1] == a[i][2])) {
				
			} else if((a[i][0] != a[i][1]) && (a[i][1] != a[i][2])) {
				
			} else {
				
			}
		}
	}
}
