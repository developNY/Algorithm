package JOBS.basic;

import java.util.Scanner;

public class tri3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=0; i<=num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=(i-1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
