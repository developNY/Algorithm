package JOBS.course3;

import java.math.BigInteger;
import java.util.Scanner;

public class combinationpascal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		BigInteger nn = BigInteger.valueOf(n);
		int m = scan.nextInt();
		BigInteger up = BigInteger.ONE;
		BigInteger down = BigInteger.ONE;
		
		for(int i=0; i<m; i++) {
			up = up.multiply(nn);
			nn = nn.subtract(BigInteger.ONE);
		}
		
		for(int i=m; i>0; i--) {
			down = down.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(up.divide(down));
	}
}
