package JOBS;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[9];
		int max = 0;
		int num=0;
		
		for(int i=0; i<9; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		for(int i=0; i<9; i++) {
			if(a[i] == max) {
				num = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
}
