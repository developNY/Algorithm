package JOBS.basic;

import java.util.Scanner;

public class point {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int a[] = new int[num];
		int score[] = new int[num];
		int sc = 0, sum = 0;
		
		for(int i=0; i<num; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(a[i] == 0) {
				score[i] = 0;
				sc = 0;
			} else {
				sc++;
				score[i] = sc;
			}
		}
		for(int i=0; i<num; i++)
			sum += score[i];
		System.out.println(sum);
	}
}
