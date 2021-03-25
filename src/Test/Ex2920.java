package Test;

import java.util.Scanner;

public class Ex2920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int da[] = new int[8];
		String result = "";

		for (int i = 0; i < 8; i++) {
			da[i] = sc.nextInt();
		}

		for (int i = 0; i < da.length-1; i++) {
			if (da[i+1] == da[i]+1) {
				result = "ascending";
			} else if (da[i+1] == da[i]-1) {
				result = "descending";
			} else {
				result = "mixed";
				break;
			}
		}

		System.out.println(result);
	}

}
