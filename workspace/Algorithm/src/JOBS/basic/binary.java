package JOBS.basic;

import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[] = new int[10000];
		int i=0;
		
		while(num >= 1) {
			a[i] = num%2;
			num = (int) num / 2;
			i++;
		}
		i--;
		while(i >= 0) {
			System.out.print(a[i]);
			i--;
		}
	}
}
