package JOBS.course3;
//재귀 쓰면 나중에 호출이 너무 많아져서 안되고, 배열을 사용해서 파스칼의 삼각형 써야함.
import java.util.Scanner;

public class fibonacci2 {
	public static int n;
	
	public static void fibo(int previous, int next, int num) {
		if(num == n-1) {
			System.out.println(next);
		} else {
			fibo(next, previous+next, num+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		fibo(0, 1, 0);
	}
}
