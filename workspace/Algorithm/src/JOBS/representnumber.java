package JOBS;

import java.util.Scanner;

public class representnumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0, j, max = 0;
		int num[] = new int[100];
		
		for(int i=0; i<10; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		
		System.out.println(sum / 10);
		
		for(int i=0; i<10; i++) {
			j = a[i] / 10;
			num[j-1]++;
		}
		for(int i=0; i<100; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		for(int i=0; i<100; i++) {
			if(num[i] == max) {
				System.out.println((i+1)*10);
				break;
			}
		}
	}
}
