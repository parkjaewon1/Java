package Test;

import java.util.*;

public class Ex2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = 0;

		if (N >= 1 && N <= 1000000) {
			for (int i = 0; i < N; i++) {
				int num = i;
				int sum = 0;

				while (num != 0) {
					sum += num % 10;
					num /= 10;
				}
				if (sum + i == N) {
					M = i;
					break;
				}
			}

		}else  {
			M = 0;
		}
		
		System.out.println(M);

	}

}
