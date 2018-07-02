package JOBS;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		for(int i=0; i<col; i++) {
			if(i == 0 || i == col-1) {
				for(int j=0; j<row; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=0; j<row; j++) {
					if(j == 0 || j == row-1) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
