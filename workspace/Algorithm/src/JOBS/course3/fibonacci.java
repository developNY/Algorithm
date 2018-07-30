package JOBS.course3;
import java.math.BigInteger;
//재귀 쓰면 나중에 호출이 너무 많아져서 안되고, 배열을 사용해서 파스칼의 삼각형 써야함. BigInteger를 쓰긴 했는데 이 문제에서는 int 써도 될 듯!
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger fibo[] = new BigInteger[n+1];
		
		fibo[0] = BigInteger.ZERO;
		fibo[1] = BigInteger.ONE;
		
		for(int i=2; i<n+1; i++) {
			fibo[i] = fibo[i-2].add(fibo[i-1]);
		}
		System.out.println(fibo[n]);
	}
}
