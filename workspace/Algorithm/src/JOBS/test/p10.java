package JOBS.test;

import java.util.ArrayList;
import java.util.Scanner;

public class p10 {
	static String [] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static ArrayList<String> [] al;
	
	static void select(ArrayList<String> al, int r) {
		for(int i=0; i<r; i++)
			al.add(alphabet[i]);
	}
	
	static int number(int n, int r) {
		int nn = 1;
		int rr = 1;
		
		for(int i=1; i<=n; i++) {
			nn = nn*i;
		}
		for(int i=1; i<=r; i++) {
			rr = rr*i;
		}
		
		return nn/rr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		al = new ArrayList[n];
		
		for(int i=0; i<n; i++) {
			select(al[i], r);
		}
		
		for(int i=0; i<r; i++) {
			for(String vv : al[i+1]) {
				System.out.print(vv);
			}
		}
		
	}
}
