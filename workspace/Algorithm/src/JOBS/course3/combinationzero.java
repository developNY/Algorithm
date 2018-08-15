package JOBS.course3;
// 10이 구성되려면 2, 5가 있어야 함. 그래서 2, 5 개수를 세면 됨.
//조합을 다 곱해서 구하지 않고 2랑 5로 나눠서 그 개수를 구하면 됨.
import java.math.BigInteger;
import java.util.Scanner;

public class combinationzero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		BigInteger nn = BigInteger.valueOf(n);
		int m = scan.nextInt();
		BigInteger up = BigInteger.ONE;
		BigInteger down = BigInteger.ONE;
		BigInteger res;
		int num = 0;
		
		for (int i = 0; i < m; i++) {
			up = up.multiply(nn);
			nn = nn.subtract(BigInteger.ONE);
		}

		for (int i = m; i > 0; i--) {
			down = down.multiply(BigInteger.valueOf(i));
		}
		
		res = up.divide(down);
		
		while(res != BigInteger.ONE) {
			if(res.mod(BigInteger.TEN) == BigInteger.ZERO) {
				num++;
				res = res.divide(BigInteger.TEN);
			} else {
				break;
			}
		}
		System.out.println(num);
	}
}
