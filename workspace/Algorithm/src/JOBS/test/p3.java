package JOBS.test;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[4];
		for(int i=0; i<4; i++)
			a[i] = scan.nextInt();

		for(int i=3; i>=0; i--) {
			if(i==1) {
				continue;
			}else{
			System.out.print(a[i] + " ");
			}
		}
		System.out.print(a[1]);
	}
}
