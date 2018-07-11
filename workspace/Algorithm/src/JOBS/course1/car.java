package JOBS.course1;

import java.util.Scanner;

public class car {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int car;
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			car = scan.nextInt();
			for(int j=0; j<3; j++) {
				if(car == (num + 10*j))
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
