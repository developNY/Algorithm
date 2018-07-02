package algorithmlabs;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=1; i<a*2; i++) {
			for(int j=a-1; j<a; j--) {
				System.out.print("*");
				for(int k=1; k<=a*2; k++) {
					System.out.print(" ");
					if(i/2)
				}
			}
			System.out.println();
		}
	}
}
