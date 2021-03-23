package Test;

import java.util.Scanner;

public class distributed_processing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c = 0;
			int r = 1;

			if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
				r = a % 10;
			} else if (a % 10 == 4 || a % 10 == 9) {
				c = b % 2;
				if (c == 0) c = 2;
			} else {
				c = b % 4;
				if (c == 0) c = 4;
			}
			for (int j = 0; j < c; j++) {
				r = (r * a) % 10;
			}
			if (r == 0)
				r = 10;
			System.out.println(r);
		}
		sc.close();
	}

}
