package JOBS.course3;

//일일이 소수를 다 구하면 타임에러 뜨고, 소수를 미리 구해놓고(이미 구간을 알고 있으니 가능) 에라토스테네스의 체를 이용해서 푼다.
import java.util.Scanner;

public class chebyshevtheo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, cnt = 0;

		while (true) {
			n = scan.nextInt();
			if (n == 0)
				break;
			if (n == 1) {
				System.out.println(1);
				continue;
			}

			for (int i = n+1; i <= 2*n; i++) {
				for (int j = 2; j <= i; j++) {
					if(j == i) {
						cnt++;
					}
					if(i % j == 0) {
						break;
					}
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
	}
}
