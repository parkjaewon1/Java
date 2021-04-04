package Test;

import java.util.*;

public class Ex2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int result1 = 0, result2 = 0, cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		while (cnt < 10) {
			result2 = result1 + arr[cnt];

			if (result1 < result2 && result2 < 100) {
				result1 = result1 + arr[cnt];
			} else if (result2 >= 100) {
				break;
			}
			cnt++;
		}
		if (result2 - 100 > 100 - result1) {
			System.out.println(result1);
		} else {
			System.out.println(result2);
		}

	}

}
