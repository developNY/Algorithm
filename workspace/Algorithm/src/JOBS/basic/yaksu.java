package JOBS.basic;

import java.util.Scanner;

public class yaksu {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int num=0;
		int [] yaksu = new int[100];
		
		for(int i=1; i<a; i++) {
			if(a%i == 0) {
				yaksu[num] = i;
				num++;
			}
		}
		if(num+1 < b) {
			System.out.println(0);
		} else {
			System.out.println(yaksu[b-1]);
		}
	}
}
