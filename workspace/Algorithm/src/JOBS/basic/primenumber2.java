package JOBS.basic;

import java.util.Scanner;

public class primenumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		int cnt = 0;

		for (; start <= end; start++) {
			for (int i = 1; i < start; i++) {
				if (start % i == 0)
					cnt++;
			}
			if(cnt != 1) {
				cnt = 0;
				continue;
			} else {
				cnt = 0;
				System.out.print(start + " ");
			}
		}
	}
}	
