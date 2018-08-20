package JOBS.course4;
//여기서 자바로 짤 경우에 void로 하면 타임 리밋이 발생한다 printf가 계속적으로 호출되기 때문에. 그래서 string으로 바꿔주는게 좋음
import java.util.Scanner;

public class mountain {
	public static String mount(int n) {
		if(n == 1) {
			return "1";
		} else {
			return mount(n-1) + n + mount(n-1);
		}
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(mount(num));
	}
}
