package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 1260번
//https://www.acmicpc.net/problem/1260
//인접리스트로 구현
public class DFSandBFS2 {
	static int vertex, edge, start;
	static ArrayList<Integer> [] a;
	static boolean [] visited;
	
	static void dfs(ArrayList<Integer> [] a, boolean [] visited, int start) {
		visited[start] = true;
		System.out.println(start+1 + " ");
		
		for(int i=0; i<=vertex; i++) {
			if(!visited[a[start].get(i)])
				dfs(a, visited, a[start].get(i));
		}
	}
	static void bfs(ArrayList<Integer> [] a, boolean [] visited, int start) {
		Queue<Integer> q = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		vertex = scan.nextInt() - 1;
		edge = scan.nextInt();
		start = scan.nextInt() - 1;
		
		a = new ArrayList[vertex + 1];
		visited = new boolean[vertex + 1];
		for(int i=0; i<=vertex; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<edge; i++) {
			int row = scan.nextInt() - 1;
			int col = scan.nextInt() - 1;
			a[row].add(col);
			a[col].add(row);
		}
		
		dfs(a, visited, start);
		
		System.out.println();
		for(int i=0; i<vertex; i++)
			visited[i] = false;
		
		bfs(a, visited, start);
	}
}
