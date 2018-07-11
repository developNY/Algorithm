package JOBS.course1;

import java.util.Scanner;

public class tetris {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int r = scan.nextInt();
		int a[][] = new int[r][c];
		int ii;
		int max = 0, cnt = 0, maxi = 0;
		int rowNum = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				a[i][j] = scan.nextInt();
		}

		for (int i = 0; i < r; i++) {
			two: for (int j = 0; j < c; j++) {
				if (((a[i][j] == 0) && (i + 1 < r) && (a[i + 1][j] == 1)) || ((i == r - 1) && (a[i][j] == 0))) {//배열 범위를 벗어나는 이슈가 발생. 병렬적이라서.
					//바닥찾기
					ii = i;
					for (int k = 0; k < 4; k++) {
						if(ii < 0) {//범위 벗어나는지 검사
							break two;
						}
						if(a[ii--][j] != 0) {//바닥 위 4칸 검사
							break two;
						}
					}
					//System.out.println("i: " + i + " j: " + j);//바닥은 제대로 찾음
					for (int l = i; l >= i-3; l--) {//바닥 위 4칸이 비어있으므로 1대입
						a[l][j] = 1;
					}
					cnt = 0;
					for (int m = 0; m < r; m++) {
						for (int n = 0; n < c; n++) {
							if(a[m][n] == 1) {// 뽀개지는 줄 세기
								cnt++;
								if(cnt == c) {
									rowNum++;
								}
							}
						}
						cnt = 0;
					}
					if(rowNum > max) {
						max = rowNum;
						maxi = i;
						//System.out.println("rowNum: " + rowNum);
					} 
						for (int l = i; l >= i-3; l--) {
							a[l][j] = 0;
						}
						rowNum = 0;
					
					ii = i;
				} //if
			} //two: for
		}
		System.out.println(maxi + " " + max);
	}
}
