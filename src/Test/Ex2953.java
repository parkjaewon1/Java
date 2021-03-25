package Test;

import java.util.*;

public class Ex2953 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		int a = 0;
		for (int j = 0; j < 5; j++) {
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				int score = sc.nextInt();
				sum += score;

				if (max <= sum) {
					max = sum;
					a = j + 1;
				}
			}

		}
		System.out.print(a + " " + max);
		sc.close();
	}
}
