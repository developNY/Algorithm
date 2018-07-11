package JOBS.basic;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
