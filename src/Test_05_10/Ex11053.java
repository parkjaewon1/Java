package Test_05_10;

import java.util.Scanner;

public class Ex11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		int[] dt = new int[n];

		for (int i = 0; i < dp.length; i++) {
			dp[i] = sc.nextInt();
		}
		
		dt[0] = 1;
		
		for (int i = 1; i < dt.length; i++) {
			dt[i] = 1;
			for (int j = 0; j < i; j++) {
				if(dp[j]<dp[i] && dt[i]<=dt[j]) {
					dt[i] = dt[j]+1;
				
				}
			}
		}
		int r = 0;
		for (int i : dt) {
			r = Math.max(r, i);
		}
		System.out.println(r);

	}

}
