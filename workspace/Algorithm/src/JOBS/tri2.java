package JOBS;

import java.util.Scanner;

public class tri2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
