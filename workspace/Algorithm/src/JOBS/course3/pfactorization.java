package JOBS.course3;
//나는 for문 1억번 도는걸 막으려고 n의 절반이 될 동안 한번도 소인수가 찍히지 않으면 소수 찍고 끝내는걸로 했는데 시간복잡도 1억번 기준
import java.util.Scanner;

public class pfactorization {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = n;

		for (int i = 2; i <= r;) {
			if (n % i == 0) {
				n /= i;
				System.out.println(i);
				if (n == 1)
					break;
			} else {
				i++;
			}
		}
	}
}
