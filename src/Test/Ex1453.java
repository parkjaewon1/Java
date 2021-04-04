package Test;

import java.util.Scanner;

public class Ex1453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean person[] = new boolean[100];
		int reject = 0;

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (person[num-1] == true) {
				reject++;
			} else {
				person[num-1] = true;
			}
		}

		System.out.println(reject);
	}

}
