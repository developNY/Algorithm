package JOBS;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		int start = scan.nextInt();
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		int rvs[] = new int[line*2-1];
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<line-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				if(i == 0) {
					if(start == 9) {
						System.out.print(a[start++]);
						start = 1;
						break;
					}
					System.out.print(a[start++]);
				} else if(i % 2 == 0) {
					for(int h=0; h<i*2+1; h++) {
						rvs[h] = a[start++];
						if(start < 1)
							start = 9;
						else if(start > 9)
							start = 1;
					}
					for(int h=i*2; h>=0; h--)
						System.out.print(rvs[h]);
					break;
				} else {
					System.out.print(a[start++]);
					if(start < 1)
						start = 9;
					else if(start > 9)
						start = 1;
				}
			}
			System.out.println();
		}
	}
}