package JOBS.course4;
//1111부터 0000까지 쓴 다음 1의 개수가 2개인 것들만 출력하는 식으로 한다.
import java.util.Scanner;

public class tobin {
	static int a[];
	public static void bin(int [] a, int n, int k) {
		if(k == ) {
			
		} else {
			a[n-1] = 1;
			bin(a, n-1, k-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		a = new int[n];
		
		bin(a, n, k);
	}
}
