package JOBS.course1;

import java.util.Scanner;

public class gcmlcm {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		int aidx = 0, bidx = 0;
		int gcd=1, lcd=1;
		a = scan.nextInt();
		b = scan.nextInt();
		int orga = a;
		int orgb = b;
		int aa[] = new int[a];
		int bb[] = new int[b];
		
		for(int i=2; i<aa.length;) {
			if(a%i == 0) {
				aa[aidx] = i;
				aidx++;
				a /= i;
			} else {
				i++;
			}
			if(a <= 1) {
				break;
			}
		}
		
		for(int i=2; i<bb.length;) {
			if(b%i == 0) {
				bb[bidx] = i;
				bidx++;
				b /= i;
			} else {
				i++;
			}
			if(b <= 1) {
				break;
			}
		}
		
		for(int i=0; i<aidx; i++) {
			for(int j=0; j<bidx; j++) {
				if(aa[i] == bb[j]) {
					gcd *= aa[i];
					bb[j] = 0;
					break;
				}
			}
		}
		System.out.println(gcd);
		System.out.println(gcd * (orga/gcd) * (orgb/gcd));
	}
}
