package JOBS.basic;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int [] a = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = scan.nextInt();
		}
		for(int i=num-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
