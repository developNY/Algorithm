package JOBS;

import java.util.Scanner;

public class gcmlcm {
	static int a;
	static int b;
	static int aa[] = new int[a];
	static int bb[] = new int[b];
	static int idx = 0;
	
	static void yaksu(int a, int aa[]) {
		for(int i=2; i<=a; i++) {
			if(a%i == 0) {
				aa[idx] = i;
				i++;
				a /= i;
			}
			if(a <= 1) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gcd=1, lcd=1;
		a = scan.nextInt();
		b = scan.nextInt();
		
		yaksu(a, aa);
		idx = 0;
		yaksu(b, bb);
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(aa[i] == bb[i]) {
					gcd *= aa[i];
				}
			}
		}
		System.out.println(gcd);
	}
}
