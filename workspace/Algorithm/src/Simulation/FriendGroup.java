package Simulation;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendGroup {
	static int relation;
	static ArrayList<Integer> [] a;
	
	public static int makeGroup(ArrayList<Integer> [] a) {
		int group;
		for(int i=0; i<relation; i++) {
			for(int v1 : a[i]) {
				for(int v2 : a[i+1]) {
					if(v1 == v2) {
						a[i].addAll(a[i+1]);
						//a[i+1].removeAll();
					}
				}
			}
		}
		return group;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		relation = scan.nextInt();
		a = new ArrayList[relation];
		for(int i=0; i<relation; i++) {
			a[i] = new ArrayList<Integer>();
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			a[i].add(user1);
			a[i].add(user2);
		}
		
		makeGroup(a);
	}
}
