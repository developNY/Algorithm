package DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 1260번
//https://www.acmicpc.net/problem/1260
//static은 클래스 내의 모든 객체가 해당 자원을 공유할 수 있도록 함.
//메모리 할당을 한번만 해서 모든 객체가 같은 메모리 주소를 바라보기 때문
//final은 변수에 지정된 값을 바꿀 수 없도록 하는 것
//DFS, BFS 개념 참고: http://mygumi.tistory.com/102
//인접행렬은 런타임에러 발생해서 인접리스트로 구현하기로 함. 입력값에서 vertex가 1000까지인데 1000*1000은 배열값이 엄청 커서 안된다고 함.
public class DFSandBFS {
	static int vertex, edge, start;
	static int [][] a;					//계속 공유되면서 사용해야 해서 static
	static boolean [] visited;			//DFS BFS 재귀함수 돌면서 방문기록 체크해야 해서 static

	static void dfs(int [][] a, boolean [] visited, int start) {//재귀 구현이 일반적
		
		visited[start] = true;		//방문기록 남김
		System.out.print(start+1 + " ");
		
		for(int i=0; i<=vertex; i++) {				
			if(a[start][i] == 1 && !visited[i]) {	//간선이 연결되어있고 방문하지 않은 정점이라면
				dfs(a, visited, i);					//재귀함수는 dfs에 적합하다. 그 이유는 재귀함수는 하나에 대해 계속 파고들면서 실행하다가 끝나면 그 전 내용을 수행하고 종료하고 그전거 수행 종료. 이렇게 백트래킹의 느낌으로 가니까
			}
		}
	}
	
	static void bfs(int [][] a, boolean [] visited, int start) {//큐 구현이 일반적	
		Queue<Integer> q = new LinkedList<>();
		
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {//큐구현이 bfs에 적합하다. bfs는 너비 탐색이기 때문에 일단 전체 탐색을 한 후 그 안으로 들어가야한다. 이때 큐에 그 안으로 들어가기 위한 정보를 저장시켜 둔다.
			int v = q.poll();
			System.out.print(v+1 + " ");
			
			for(int i=0; i<=vertex; i++) {
				if(a[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		vertex = scan.nextInt() - 1;	//0부터 배열 사용 위함
		edge = scan.nextInt();
		start = scan.nextInt() - 1; 	//0부터 배열 사용 위함
		
		//인접행렬, 방문기록 할당
		a = new int[vertex+1][vertex+1];	//배열할당할 때는 개수대로 할당해야 함.
		visited = new boolean[vertex+1];
		
		//인접행렬 초기화
		for(int i=0; i<edge; i++) {
			int row = scan.nextInt();	//0부터 배열 사용 위함
			int col = scan.nextInt();	//0부터 배열 사용 위함
			a[row-1][col-1] = 1;
			a[col-1][row-1] = 1;
		}
		
		dfs(a, visited, start);
		
		System.out.println();
		for(int i=0; i<=vertex; i++)
			visited[i] = false;		//방문기록 초기화. dfs bfs 안에서 해주면 절대 안된다. 실행 될 때마다 방문기록을 지우게 됨
		
		bfs(a, visited, start);
	}
}
