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
		/*if (visited[start]) {
			return;
		}*/

		visited[start] = true;
		System.out.print(start+1 + " ");

		for (int vv : a[start]) {		//이런식으로 for each를 써서 하나씩 접근하고 ArrayList에 들어가지 않는 부분 자연스럽게 넘길 수 있음
			if (!visited[vv]) {
				dfs(a, visited, vv);
			}
		}
	}
	static void bfs(ArrayList<Integer> [] a, boolean [] visited, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.print(v+1 + " ");

			for (int vv : a[v]) {
				if (!visited[vv]) {
					q.add(vv);
					visited[vv] = true;
				}
			}
		}
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
		for(int i=0; i<=vertex; i++)
			visited[i] = false;
		
		bfs(a, visited, start);
	}
}