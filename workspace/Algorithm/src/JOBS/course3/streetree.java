package JOBS.course3;

//나누는 기준이 최소가 아니고 차들의 최대 공약수였다ㅠㅠㅠ
import java.util.Scanner;

public class streetree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tree[] = new int[n];
		int cha[] = new int[n - 1];
		int gcd = 1, max = 0, cnt = 0;

		for (int i = 0; i < n; i++) {
			tree[i] = scan.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			cha[i] = tree[i + 1] - tree[i];
			if (cha[i] > max)
				max = cha[i];
		}

		for(int i=2; i<max; i++) {
			if(cnt == n-1) {
				for(int j=0; j<n-1; j++) {
					cha[i] %= i;
					
				}
				cnt = 0;
			}
			if(cha[i] % i == 0) {
				cnt++;
			}
		}
	}
}
