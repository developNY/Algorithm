package JOBS.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			a.add(scan.nextInt());
		}
		Collections.sort(a);
		for(int i=0; i<num; i++)
			System.out.print(a.get(i) + " ");
	}
}
