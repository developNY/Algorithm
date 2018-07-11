package JOBS.course1;
//이중 for문 빠져나가려고 two: for() break two; 이런거 쓰면 안됨. 플래그로 하기
import java.util.Scanner;

public class tetris {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int a[][] = new int[r][c];
		int ii;
		int max = 0, cnt = 0, maxj = 0;
		int rowNum = 0;
		int flag = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				a[i][j] = scan.nextInt();
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if ((a[i][j] == 0) && (i + 1 < r)) {// 맨 밑이 아닌 바닥 찾기
					if ((a[i + 1][j] == 1)) {
						// 바닥찾기
						ii = i;
						for (int k = 0; k < 4; k++) {
							if (ii < 0) {// 범위 벗어나는지 검사
								flag = 1;
								break;
							}
							if (a[ii--][j] != 0) {// 바닥 위 4칸 검사
								flag = 1;
								break;
							}
						}
						if(flag == 1) {
							flag = 0;
							continue;	//break로 했었는데 이렇게 하면 안되는게 이거 하나로 row전체가 아닌것은 아니므로 break가 아닌 continue로 해야함.
						}

						// System.out.println("i: " + i + " j: " + j);//바닥은 제대로 찾음
						for (int l = i; l >= i - 3; l--) {// 바닥 위 4칸이 비어있으므로 1대입
							a[l][j] = 1;
						}
						cnt = 0;
						for (int m = 0; m < r; m++) {
							for (int n = 0; n < c; n++) {
								if (a[m][n] == 1) {// 뽀개지는 줄 세기
									cnt++;
									if (cnt == c) {
										rowNum++;
									}
								}
							}
							cnt = 0;
						}
						if (rowNum > max) {
							max = rowNum;
							maxj = j;
							// System.out.println("rowNum: " + rowNum);
						}
						for (int l = i; l >= i - 3; l--) {
							a[l][j] = 0;
						}
						rowNum = 0;

						ii = i;
					}
				} // if
				if ((i == r - 1) && (a[i][j] == 0)) {// 맨 밑 바닥일 때
					// 바닥찾기
					ii = i;
					for (int k = 0; k < 4; k++) {
						if (ii < 0) {// 범위 벗어나는지 검사
							flag = 1;
							break;
						}
						if (a[ii--][j] != 0) {// 바닥 위 4칸 검사
							flag = 1;
							break;
						}
					}
					if(flag == 1) {
						flag = 0;
						continue;
					}

					// System.out.println("i: " + i + " j: " + j);//바닥은 제대로 찾음
					for (int l = i; l >= i - 3; l--) {// 바닥 위 4칸이 비어있으므로 1대입
						a[l][j] = 1;
					}
					cnt = 0;
					for (int m = 0; m < r; m++) {
						for (int n = 0; n < c; n++) {
							if (a[m][n] == 1) {// 뽀개지는 줄 세기
								cnt++;
								if (cnt == c) {
									rowNum++;
								}
							}
						}
						cnt = 0;
					}
					if (rowNum > max) {
						max = rowNum;
						maxj = j;
						// System.out.println("rowNum: " + rowNum);
					}
					for (int l = i; l >= i - 3; l--) {
						a[l][j] = 0;
					}
					rowNum = 0;

					ii = i;
				} // if

			} //for
		}
		if (max == 0) {
			System.out.println("0 0");
		} else {
			System.out.println(maxj + 1 + " " + max);
		}
	}
}
