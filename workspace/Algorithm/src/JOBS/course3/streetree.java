//package JOBS.course3;

//나누는 기준이 최소가 아니고 차들의 최대 공약수였다ㅠㅠㅠ
import java.util.Scanner;

public class streetree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tree[] = new int[n];
		int cha[] = new int[n - 1];
		int gcd = 1, max = 0, cnt = 0, mintree = 1000000000, maxtree = 0;

		for (int i = 0; i < n; i++) {
			tree[i] = scan.nextInt();
			if (tree[i] > maxtree)
				maxtree = tree[i];
			if (tree[i] < mintree)
				mintree = tree[i];
		}

		for (int i = 0; i < n - 1; i++) {
			cha[i] = tree[i + 1] - tree[i];
			if (cha[i] > max)
				max = cha[i];
		}

		for (int i = 2; i < max;) {
			for (int j = 0; j <= n - 1; j++) {
				if (j == n - 1) {
					gcd *= i;
					for(int k=0; k<n; k++) {
						cha[k] /= i;
					}
					break;
				}
				if (cha[j] % i != 0) {
					break;
				}
			}
			i++;
		}

		for (int i = mintree + gcd; i < maxtree;) {
			for (int j = 0; j <= n; j++) {
				if(j == n) {
					cnt++;
					break;
				}
				if (i == tree[j])
					break;
			}
			i += gcd;
		}
		System.out.println(cnt);
	}
}
