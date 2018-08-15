package JOBS.course3;

//일일이 소수를 다 구하면 타임에러 뜨고, 소수를 미리 구해놓고(이미 구간을 알고 있으니 가능) 에라토스테네스의 체를 이용해서 푼다.
//먼저  n 이전의 수에서 소수를 구해서 배열에 저장해두고 그걸로 나눠주면 된다.
import java.util.Scanner;

public class chebyshevtheo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, cnt = 0, s = 0;
		int a[] = new int[123456];
		
		for (int i = 2; i <= 123456; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					a[s] = i;
					s++;
				}
				if (i % j == 0)
					break;
			}
		}
		
		for(int i=0; i<s; i++) {
			System.out.print(a[i]);
		}

		while (true) {
			n = scan.nextInt();
			
			if(n == 1) {
				System.out.println(1);
				continue;
			}
			if(n == 0) {
				break;
			}

			for (int i = n + 1; i <= 2 * n; i++) {
                for (int j = 0; j <= s; j++) {
                    if (j == s) {
                        cnt++;
                        break;
                    }
                    if (i % a[j] == 0) {
                        break;
                    }
                }
            }

			System.out.println(cnt);
			cnt = 0;
		}
	}
}
