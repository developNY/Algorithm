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

		for (int i = 2; i <= max;) {//이렇게 하면 max가 1억이 될 수도 있어서 이렇게 하면 안되고 유클리드 호제법?을 써야 된다고 함.
			for (int j = 0; j < cha.length; j++) {
				if (cha[j] % i == 0) {
					cnt++;
				}
			}
			if (cnt == cha.length) {
				gcd *= i;
			} else {
				i++;
			}
		}

		for (int i = 0; i < ; i++) {

		}
	}
}
