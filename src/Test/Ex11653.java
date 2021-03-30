package Test;

import java.util.*;

public class Ex11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N != 0 && N < 10000000) {

			for (int i = 2; i < N; i++) {
				while (N % i == 0) {
					System.out.println(i);
					N = N / i;
				}
			}
			if(N!=1) {
			System.out.println(N);
			}
		}

	}

}
