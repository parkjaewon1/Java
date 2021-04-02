package Test;

import java.util.*;

public class Ex9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String T = sc.nextLine();
			String[] Test = T.split(" ");

			for (int j = 0; j < Test.length; j++) {
				String answer = "";
				for (int k = Test[j].length() - 1; k >= 0; k--) {
					answer += Test[j].charAt(k);
				}
				System.out.print(answer);
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
