package JOBS;

import java.util.Scanner;

public class point {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int a[] = new int[num];
		int score[] = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(a[i] == 0)
				score[i] = 0;
			else
				score[i] = score;
		}
	}
}
