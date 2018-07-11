package JOBS.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=0; i<3; i++)
			a.add(scan.nextInt());
		Collections.sort(a);
		System.out.println(a.get(1));
	}
}
