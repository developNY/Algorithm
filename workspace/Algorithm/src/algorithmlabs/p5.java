package algorithmlabs;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int c = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=a; i<=c; i++) {
			System.out.print(i + " ");
			if(i == c) {
				for(int j=c-1; j>=b; j--)
					System.out.print(j + " ");
			}
		}
	}
}
