package Test_05_10;

import java.util.Scanner;

public class Ex10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[][] dp = new long[n+1][10];
		long mod = 1000000000;

		
			for (int i = 1; i < 10; i++) {
				dp[1][i] = 1;
			}
		

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					dp[i][0] = dp[i - 1][1];
				}
				else if (j == 9) {
					dp[i][9] = dp[i - 1][8];
				}
				else {
					dp[i][j] = dp[i - 1][j - 1]  + dp[i - 1][j + 1];
				}
			}
		}
		long answer = 0;

		for (int i = 0; i < 10; i++) {
			answer += dp[n][i];
		}
		System.out.println(answer % mod);

	}

}
