package JOBS;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		int start = scan.nextInt();
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<line-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				if(i == 0) {
					System.out.print(a[start]-1);
					start++;
				} else if(i % 2 != 1) {
					System.out.print(a[start++]-1);
					if(start < 0)
						start = 8;
					else if(start > 8)
						start = 0;
				} else {
					System.out.print(a[start++]-1);
					if(start < 0)
						start = 8;
					else if(start > 8)
						start = 0;
				}
			}
			System.out.println();
		}
	}
}
