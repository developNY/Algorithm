package JOBS.course3;

//일일이 소수를 다 구하면 타임에러 뜨고, 소수를 미리 구해놓고(이미 구간을 알고 있으니 가능) 에라토스테네스의 체를 이용해서 푼다.
import java.util.Scanner;

public class chebyshevtheo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, cnt = 0;
		int prime[] = new int[123456];

		for (int i = 2; i < 123456; i++) {
			for (int j = 2; j <= i; j++) {
				if(i % j == 0) {
					break;
				}
			}
		}

		while (true)

		{
			n = scan.nextInt();
			if (n == 0)
				break;

			for (int i = n + 1; i <= 2 * n; i++) {
				for (int j = 2; j <= i; j++) {
					if (i == j) {
						cnt++;
						break;
					}
					if (i % j == 0)
						break;
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
	}
}
