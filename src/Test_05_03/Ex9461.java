package Test_05_03;

import java.util.Scanner;
public class Ex9461 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		long arr[] = new long[101];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		for (int i = 4; i < arr.length; i++) {
			arr[i] = arr[i-3] + arr[i-2];
		}
		
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();
			System.out.println(arr[N]);
			
		}

	}

}

