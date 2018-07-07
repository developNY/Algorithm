package JOBS;
//접근하는 방법은 2가지가 있다. 수열과 2차원배열. 수열은 너무 복잡하니까 2차원배열의 i, j값을 계속 초기 세팅해주면서 변화시키느 방법으로 접근하는게 가장 효율적임.
import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][] = new int[n][n];
		int k=1, r=0, c=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {	//이부분 이해하는게 중요함
				a[r][c] = k;
				r++;
				c--;
				if(c < 0) {
					r = 0;
					c = j+1;
					k++;
				} else {
					k++;
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
