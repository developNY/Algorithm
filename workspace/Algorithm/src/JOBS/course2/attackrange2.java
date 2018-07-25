package JOBS.course2;
//거리사이의 절대값으로 풀면 쉽게 풀린다. 기준점이랑 좌표값이랑 절대값을 구해서 사거리보다 작거나 같으면 뒤집어서
//이중 for문 하나로 한번만 탐색해서 풀 수 있다.
import java.util.Scanner;

public class attackrange2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int map[][] = new int[n][n];
		int unitX = scan.nextInt() - 1;
		int unitY = scan.nextInt() - 1;
		int ar = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((Math.abs(unitX-i) + Math.abs(unitY-j) <= ar) && (Math.abs(unitX-i) + Math.abs(unitY-j) > 0)) {
					System.out.print(Math.abs(unitX-i) + Math.abs(unitY-j) + " ");
				} else if (i == unitX && j == unitY){
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
