package JOBS;
// 소수구하기 제일 쉬운 방법은 2부터 입력숫자전까지 약수를 구한 뒤, 약수의 개수가 1개 이상이면 소수가 아닌것이다
import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int cnt = 0;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0)
				cnt++;
		}
		
		if(cnt >= 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
