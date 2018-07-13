//package JOBS.course2;

import java.util.Scanner;

public class maxoffarr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[9][9];
		int max = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++)
				a[i][j] = scan.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(a[i][j] > max)
					max = a[i][j];
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(a[j][i] == max) {
					System.out.println(max);
					System.out.print(j+1);
					System.out.print(" ");
					System.out.print(i+1);
					break;
				}
			}
		}
	}
}
