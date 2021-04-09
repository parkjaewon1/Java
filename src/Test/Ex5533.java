package Test;

import java.util.*;

public class Ex5533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		int[] score = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				boolean flag = true;
				for (int k = 0; k < N; k++) {
					if (i == k) {
						continue;
					}
					if (arr[i][j] == arr[k][j]) {
						flag = false;
						break;
					}
				}
				if (flag)
					score[i] += arr[i][j];
			}

		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		sc.close();

	}
}
