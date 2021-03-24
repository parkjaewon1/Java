package Test;

import java.util.Scanner;

class Ex5543 {
	public static void main(String[] args) {

		int b;
		int d;
		Scanner sc = new Scanner(System.in);

		b = 2001;
		d = 2001;

		for (int i = 0; i < 3; i++) {
			int v = sc.nextInt();
			if (v < b) {
				b = v;
			}

		}
		for (int i = 0; i < 2; i++) {
			int vv = sc.nextInt();
			if (vv < d) {
				d = vv;
			}

		}
		System.out.println(b + d - 50);

	}
}
