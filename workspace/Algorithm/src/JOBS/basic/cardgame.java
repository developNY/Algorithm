package JOBS.basic;

import java.util.Scanner;

public class cardgame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int aa = 0, bb = 0;
		
		for(int i=0; i<10; i++)
			a[i] = scan.nextInt();
		for(int i=0; i<10; i++)
			b[i] = scan.nextInt();
		
		for(int i=0; i<10; i++) {
			if(a[i]>b[i]) {
				aa++;
			} else if (a[i] == b[i]){
				continue;
			} else {
				bb++;
			}
		}
		
		if(aa > bb)
			System.out.println("A");
		else if (aa == bb)
			System.out.println("D");
		else
			System.out.println("B");
	}
}
